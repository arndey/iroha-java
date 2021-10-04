package jp.co.soramitsu.iroha2

import jp.co.soramitsu.iroha2.engine.ALICE_ACCOUNT_ID
import jp.co.soramitsu.iroha2.engine.ALICE_ACCOUNT_NAME
import jp.co.soramitsu.iroha2.engine.ALICE_KEYPAIR
import jp.co.soramitsu.iroha2.engine.DEFAULT_DOMAIN_NAME
import jp.co.soramitsu.iroha2.engine.FewAssets
import jp.co.soramitsu.iroha2.engine.IrohaRunnerExtension
import jp.co.soramitsu.iroha2.engine.NewAccountWithMetadata
import jp.co.soramitsu.iroha2.engine.WithIroha
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import kotlin.test.assertEquals

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(IrohaRunnerExtension::class)
@Timeout(30)
class QueriesTest {

    lateinit var client: Iroha2Client

    @Test
    @WithIroha(NewAccountWithMetadata::class)
    fun `find all accounts`(): Unit = runBlocking {
        QueryBuilder.findAllAccounts()
            .account(ALICE_ACCOUNT_ID)
            .buildSigned(ALICE_KEYPAIR)
            .let { query ->
                client.sendQuery(query)
            }.also { accounts ->
                assert(accounts.any { it.id.name == ALICE_ACCOUNT_NAME })
                assert(accounts.any { it.id.name == NewAccountWithMetadata.ACCOUNT_NAME })
            }
    }

    @Test
    @WithIroha
    fun `find accounts by name`(): Unit = runBlocking {
        QueryBuilder.findAccountsByName(ALICE_ACCOUNT_NAME)
            .account(ALICE_ACCOUNT_ID)
            .buildSigned(ALICE_KEYPAIR)
            .let { query ->
                client.sendQuery(query)
            }.also { accounts ->
                assert(accounts.all { it.id.name == ALICE_ACCOUNT_NAME })
            }
    }

    @Test
    @WithIroha(NewAccountWithMetadata::class)
    fun `find account key value by id and key`(): Unit = runBlocking {
        QueryBuilder.findAccountKeyValueByIdAndKey(
            NewAccountWithMetadata.ACCOUNT_ID,
            NewAccountWithMetadata.KEY
        )
            .account(ALICE_ACCOUNT_ID)
            .buildSigned(ALICE_KEYPAIR)
            .let { query ->
                client.sendQuery(query)
            }.also {
                assertEquals(NewAccountWithMetadata.VALUE, it)
            }
    }

    @Test
    @WithIroha
    fun `find accounts by domain name`(): Unit = runBlocking {
        QueryBuilder.findAccountsByDomainName(DEFAULT_DOMAIN_NAME)
            .account(ALICE_ACCOUNT_ID)
            .buildSigned(ALICE_KEYPAIR)
            .let { query ->
                client.sendQuery(query)
            }.also { accounts ->
                assert(accounts.all { it.id.domainName == DEFAULT_DOMAIN_NAME })
            }
    }

    @Test
    @WithIroha(FewAssets::class)
    fun `find all assets`(): Unit = runBlocking {
        QueryBuilder.findAllAssets()
            .account(ALICE_ACCOUNT_ID)
            .buildSigned(ALICE_KEYPAIR)
            .let { query ->
                client.sendQuery(query)
            }.also { assets ->
                assert(assets.any { it.id.definitionId == FewAssets.DEFINITION_ID1 })
                assert(assets.any { it.id.definitionId == FewAssets.DEFINITION_ID2 })
            }
    }

    @Test
    @WithIroha(FewAssets::class)
    fun `find assets by name`(): Unit = runBlocking {
        QueryBuilder.findAssetsByName(FewAssets.DEFINITION_ID1.name)
            .account(ALICE_ACCOUNT_ID)
            .buildSigned(ALICE_KEYPAIR)
            .let { query ->
                client.sendQuery(query)
            }.also { assets ->
                assert(assets.all { it.id.definitionId.name == FewAssets.DEFINITION_ID1.name })
            }
    }
}
