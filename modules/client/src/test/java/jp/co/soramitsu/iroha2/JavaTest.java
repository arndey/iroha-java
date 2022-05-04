package jp.co.soramitsu.iroha2;

import jp.co.soramitsu.iroha2.client.Iroha2AsyncClient;
import jp.co.soramitsu.iroha2.engine.DefaultGenesis;
import jp.co.soramitsu.iroha2.engine.IrohaRunnerExtension;
import jp.co.soramitsu.iroha2.engine.WithIroha;
import jp.co.soramitsu.iroha2.generated.datamodel.Name;
import jp.co.soramitsu.iroha2.generated.datamodel.account.Account;
import jp.co.soramitsu.iroha2.generated.datamodel.asset.AssetValue;
import jp.co.soramitsu.iroha2.generated.datamodel.asset.AssetValueType;
import jp.co.soramitsu.iroha2.generated.datamodel.domain.Domain;
import jp.co.soramitsu.iroha2.generated.datamodel.domain.Id;
import jp.co.soramitsu.iroha2.generated.datamodel.transaction.VersionedTransaction;
import jp.co.soramitsu.iroha2.query.QueryAndExtractor;
import jp.co.soramitsu.iroha2.query.QueryBuilder;
import jp.co.soramitsu.iroha2.transaction.TransactionBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static jp.co.soramitsu.iroha2.engine.TestConstsKt.*;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(IrohaRunnerExtension.class)
@Timeout(40)
public class JavaTest extends AbstractTest {

    public Iroha2AsyncClient client;

    @Test
    @WithIroha(genesis = DefaultGenesis.class)
    public void instructionFailed() throws MalformedURLException {
        final VersionedTransaction transaction = TransactionBuilder.Companion
            .builder()
            .account(ALICE_ACCOUNT_ID)
            .fail("FAIL MESSAGE")
            .buildSigned(ALICE_KEYPAIR);
        final CompletableFuture<byte[]> future = client.sendTransactionAsync(transaction);
        Assertions.assertThrows(ExecutionException.class, () -> future.get(10, TimeUnit.SECONDS));
    }

    @Test
    @WithIroha(genesis = DefaultGenesis.class)
    public void registerDomainInstructionCommitted() throws ExecutionException, InterruptedException, TimeoutException {
        final Id domainId = new Id(new Name("new_domain_name"));
        final VersionedTransaction transaction = TransactionBuilder.Companion
            .builder()
            .account(ALICE_ACCOUNT_ID)
            .registerDomain(domainId)
            .buildSigned(ALICE_KEYPAIR);
        client.sendTransactionAsync(transaction).get(10, TimeUnit.SECONDS);

        final QueryAndExtractor<Domain> query = QueryBuilder
            .findDomainById(domainId)
            .account(ALICE_ACCOUNT_ID)
            .buildSigned(ALICE_KEYPAIR);
        final CompletableFuture<Domain> future = client.sendQueryAsync(query);
        final Domain domain = future.get(10, TimeUnit.SECONDS);
        Assertions.assertEquals(domain.getId(), domainId);
    }

    @Test
    @WithIroha(genesis = DefaultGenesis.class)
    public void registerAccountInstructionCommitted() throws Exception {
        final jp.co.soramitsu.iroha2.generated.datamodel.account.Id accountId = new jp.co.soramitsu.iroha2.generated.datamodel.account.Id(
            new Name("new_account"),
            DEFAULT_DOMAIN_ID
        );
        final VersionedTransaction transaction = TransactionBuilder.Companion
            .builder()
            .account(ALICE_ACCOUNT_ID)
            .registerAccount(accountId, new ArrayList<>())
            .buildSigned(ALICE_KEYPAIR);
        client.sendTransactionAsync(transaction).get(10, TimeUnit.SECONDS);

        final QueryAndExtractor<Account> query = QueryBuilder
            .findAccountById(accountId)
            .account(ALICE_ACCOUNT_ID)
            .buildSigned(ALICE_KEYPAIR);
        final CompletableFuture<Account> future = client.sendQueryAsync(query);
        final Account account = future.get(10, TimeUnit.SECONDS);
        Assertions.assertEquals(account.getId(), accountId);
    }

    @Test
    @WithIroha(genesis = DefaultGenesis.class)
    public void mintAssetInstructionCommitted() throws Exception {
        final VersionedTransaction registerAssetTx = TransactionBuilder.Companion
            .builder()
            .account(ALICE_ACCOUNT_ID)
            .registerAsset(DEFAULT_ASSET_DEFINITION_ID, new AssetValueType.Quantity())
            .buildSigned(ALICE_KEYPAIR);
        client.sendTransactionAsync(registerAssetTx).get(10, TimeUnit.SECONDS);

        final VersionedTransaction mintAssetTx = TransactionBuilder.Companion
            .builder()
            .account(ALICE_ACCOUNT_ID)
            .mintAsset(DEFAULT_ASSET_ID, 5L)
            .buildSigned(ALICE_KEYPAIR);
        client.sendTransactionAsync(mintAssetTx).get(10, TimeUnit.SECONDS);

        final QueryAndExtractor<Account> query = QueryBuilder
            .findAccountById(ALICE_ACCOUNT_ID)
            .account(ALICE_ACCOUNT_ID)
            .buildSigned(ALICE_KEYPAIR);
        final CompletableFuture<Account> future = client.sendQueryAsync(query);
        final Account account = future.get(10, TimeUnit.SECONDS);
        final AssetValue value = account.getAssets().get(DEFAULT_ASSET_ID).getValue();
        Assertions.assertEquals(5, ((AssetValue.Quantity) value).getU32());
    }
}