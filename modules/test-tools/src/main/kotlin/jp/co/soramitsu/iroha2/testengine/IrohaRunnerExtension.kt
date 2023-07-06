package jp.co.soramitsu.iroha2.testengine

import jp.co.soramitsu.iroha2.AdminIroha2AsyncClient
import jp.co.soramitsu.iroha2.AdminIroha2Client
import jp.co.soramitsu.iroha2.Genesis.Companion.toSingle
import jp.co.soramitsu.iroha2.cast
import jp.co.soramitsu.iroha2.client.Iroha2AsyncClient
import jp.co.soramitsu.iroha2.client.Iroha2Client
import jp.co.soramitsu.iroha2.findFreePorts
import jp.co.soramitsu.iroha2.generateKeyPair
import jp.co.soramitsu.iroha2.generated.PeerId
import jp.co.soramitsu.iroha2.generated.SocketAddr
import jp.co.soramitsu.iroha2.generated.SocketAddrHost
import jp.co.soramitsu.iroha2.toIrohaPublicKey
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.InvocationInterceptor
import org.junit.jupiter.api.extension.ReflectiveInvocationContext
import org.testcontainers.containers.Network
import java.lang.reflect.Method
import java.net.URL
import java.security.KeyPair
import java.util.Collections
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.memberProperties

/**
 * Runner for Iroha2 Docker containers
 */
class IrohaRunnerExtension : InvocationInterceptor, BeforeEachCallback {

    private val resources: MutableMap<String, List<AutoCloseable>> = Collections.synchronizedMap(mutableMapOf())

    override fun beforeEach(context: ExtensionContext) = runBlocking {
        // init container and client if annotation was passed on test method
        val testId = context.testId()
        resources[testId] = initIfRequested(context)
    }

    override fun interceptTestMethod(
        invocation: InvocationInterceptor.Invocation<Void>,
        invocationContext: ReflectiveInvocationContext<Method>,
        extensionContext: ExtensionContext,
    ) = runBlocking {
        val testId = extensionContext.testId()
        try {
            // invoke actual test method
            super.interceptTestMethod(invocation, invocationContext, extensionContext)
        } finally {
            // stop container and client if they were created
            resources[testId]?.forEach { it.close() }
        }
    }

    private suspend fun initIfRequested(
        extensionContext: ExtensionContext,
    ): List<AutoCloseable> = coroutineScope {
        val withIroha = extensionContext.element.get()
            .annotations.filterIsInstance<WithIroha>()
            .firstOrNull()
        val withIrohaManual = extensionContext.element.get()
            .annotations.filterIsInstance<WithIrohaManual>()
            .firstOrNull()

        return@coroutineScope when {
            withIroha != null -> withIroha.init(extensionContext)
            withIrohaManual != null -> withIrohaManual.init(extensionContext).let { emptyList() }
            else -> emptyList()
        }
    }

    private suspend fun WithIroha.init(extensionContext: ExtensionContext): List<AutoCloseable> {
        val testInstance = extensionContext.testInstance.get()
        val network = testInstance.cast<IrohaTest<*>>().network

        val utilizedResources = mutableListOf<AutoCloseable>()

        // start containers
        val containers = createContainers(this, network)
        utilizedResources.addAll(containers)

        val properties = testInstance::class.memberProperties

        // inject `List<IrohaContainer>` if it is declared in test class
        setPropertyValue(properties, testInstance) { containers }

        // inject `Iroha2Client` if it is declared in test class
        setPropertyValue(properties, testInstance) {
            Iroha2Client(containers.first().getApiUrl(), log = true)
                .also { utilizedResources.add(it) }
        }

        // inject `AdminIroha2Client` if it is declared in test class
        setPropertyValue(properties, testInstance) {
            AdminIroha2Client(
                containers.first().getApiUrl(),
                containers.first().getTelemetryUrl(),
                log = true,
            ).also { utilizedResources.add(it) }
        }

        // inject `Iroha2AsyncClient` if it is declared in test class
        setPropertyValue(properties, testInstance) {
            Iroha2AsyncClient(containers.first().getApiUrl(), log = true)
                .also { utilizedResources.add(it) }
        }

        // inject `AdminIroha2AsyncClient` if it is declared in test class
        setPropertyValue(properties, testInstance) {
            AdminIroha2AsyncClient(
                containers.first().getApiUrl(),
                containers.first().getTelemetryUrl(),
                log = true,
            ).also { utilizedResources.add(it) }
        }

        return utilizedResources
    }

    private fun WithIrohaManual.init(extensionContext: ExtensionContext) {
        val testInstance = extensionContext.testInstance.get()
        val properties = testInstance::class.memberProperties

        // inject `Iroha2Client` if it is declared in test class
        setPropertyValue(properties, testInstance) { Iroha2Client(URL(this.apiUrl), log = true) }

        // inject `AdminIroha2Client` if it is declared in test class
        setPropertyValue(properties, testInstance) {
            AdminIroha2Client(URL(this.apiUrl), URL(this.telemetryUrl), log = true)
        }

        // inject `Iroha2AsyncClient` if it is declared in test class
        setPropertyValue(properties, testInstance) { Iroha2AsyncClient(URL(this.apiUrl), log = true) }

        // inject `AdminIroha2AsyncClient` if it is declared in test class
        setPropertyValue(properties, testInstance) {
            AdminIroha2AsyncClient(URL(this.apiUrl), URL(this.telemetryUrl), log = true)
        }
    }

    private inline fun <reified V : Any> setPropertyValue(
        declaredProperties: Collection<KProperty1<out Any, *>>,
        testClassInstance: Any,
        valueToSet: () -> V,
    ) {
        declaredProperties
            .filter { it.returnType.classifier == V::class }
            .filterIsInstance<KMutableProperty1<out Any, V>>()
            .also {
                check(it.size <= 1) {
                    """
                        "Found more than one property with type `${V::class.qualifiedName}`
                         in test class `${testClassInstance::class::qualifiedName}`"
                    """.trimIndent()
                }
            }.firstOrNull()
            ?.setter
            ?.call(testClassInstance, valueToSet())
    }

    private suspend fun createContainers(
        withIroha: WithIroha,
        network: Network,
    ): List<IrohaContainer> = coroutineScope {
        val keyPairs = mutableListOf<KeyPair>()
        val portsList = mutableListOf<List<Int>>()

        repeat(withIroha.amount + 1) {
            keyPairs.add(generateKeyPair())
            portsList.add(findFreePorts(3)) // P2P + API + TELEMETRY
        }
        val genesisKeyPair = keyPairs.last()
        val peerIds = keyPairs.mapIndexed { i: Int, kp: KeyPair ->
            val p2pPort = portsList[i][IrohaConfig.P2P_PORT_IDX]
            kp.toPeerId(IrohaContainer.NETWORK_ALIAS + p2pPort, p2pPort)
        }
        val deferredSet = mutableSetOf<Deferred<*>>()
        val containers = Collections.synchronizedList(ArrayList<IrohaContainer>(withIroha.amount))
        repeat(withIroha.amount) { n ->
            async {
                val p2pPort = portsList[n][IrohaConfig.P2P_PORT_IDX]
                val container = IrohaContainer {
                    networkToJoin = network
                    when {
                        withIroha.source.isNotEmpty() -> genesisPath = withIroha.source
                        else -> genesis = withIroha.sources.map { it.createInstance() }.toSingle()
                    }
                    alias = IrohaContainer.NETWORK_ALIAS + p2pPort
                    keyPair = keyPairs[n]
                    this.genesisKeyPair = genesisKeyPair
                    trustedPeers = peerIds
                    ports = portsList[n]
                    envs = withIroha.configs.associate { config ->
                        config.split(IROHA_CONFIG_DELIMITER).let {
                            it.first() to it.last()
                        }
                    }
                    // only first peer should have --submit-genesis in peer start command
                    submitGenesis = n == 0
                }
                container.start()
                containers.add(container)
            }.let { deferredSet.add(it) }
        }

        deferredSet.forEach { it.await() }

        containers
    }

    private fun KeyPair.toPeerId(host: String, port: Int) = PeerId(
        SocketAddr.Host(SocketAddrHost(host, port)),
        this.public.toIrohaPublicKey(),
    )

    private fun ExtensionContext.testId() = "${this.testClass.get().name}_${this.testMethod.get().name}"
}
