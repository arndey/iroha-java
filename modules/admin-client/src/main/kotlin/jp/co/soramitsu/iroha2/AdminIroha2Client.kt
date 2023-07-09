package jp.co.soramitsu.iroha2

import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.setBody
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType
import jp.co.soramitsu.iroha2.client.Iroha2Client
import java.net.URL

/**
 * Enhancement of [Iroha2Client] for monitoring peers and configuration support
 */
@Suppress("unused")
open class AdminIroha2Client(
    urls: MutableList<Pair<URL, URL>>,
    log: Boolean = false,
    credentials: String? = null,
) : Iroha2Client(urls, log, credentials) {

    /**
     * Send metrics request
     */
    suspend fun metrics(): String {
        return client
            .get("${getTelemetryUrl()}$METRICS_ENDPOINT")
            .body()
    }

    /**
     * Send health check request
     */
    suspend fun health(): Int {
        return client
            .get("${getPeerUrl()}$HEALTH_ENDPOINT")
            .status.value
    }

    /**
     * Send status check request
     */
    suspend fun status(): PeerStatus {
        return client
            .get("${getTelemetryUrl()}$STATUS_ENDPOINT")
            .body()
    }

    /**
     * Send schema request
     */
    suspend fun schema(): String {
        return client
            .get("${getTelemetryUrl()}$SCHEMA_ENDPOINT")
            .body()
    }

    /**
     * Request current configuration of the peer
     */
    suspend fun getConfigs(): Map<String, *> {
        return config(ConfigurationFieldType.Value)
    }

    /**
     * Request description of a configuration property
     */
    suspend fun describeConfig(fieldValue: Collection<String>): String {
        if (fieldValue.isEmpty()) {
            throw IrohaClientException("At least one config property name must be provided")
        }
        return config(mapOf(ConfigurationFieldType.Docs to fieldValue))
    }

    suspend fun describeConfig(vararg fieldValue: String): String = describeConfig(fieldValue.asList())

    private suspend inline fun <reified T, reified B> config(body: B): T {
        val response: HttpResponse = client.get("${getPeerUrl()}$CONFIGURATION_ENDPOINT") {
            contentType(ContentType.Application.Json)
            setBody(body)
        }
        return response.body()
    }

    enum class ConfigurationFieldType { Value, Docs }
}
