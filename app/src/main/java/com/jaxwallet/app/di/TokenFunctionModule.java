package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.CreateTransactionInteract;
import com.jaxwallet.app.interact.FetchTransactionsInteract;
import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.repository.TokenRepositoryType;
import com.jaxwallet.app.repository.TransactionRepositoryType;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.router.TransferTicketDetailRouter;
import com.jaxwallet.app.service.AnalyticsServiceType;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.GasService;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.service.OpenSeaService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.TokenFunctionViewModelFactory;

import dagger.Module;
import dagger.Provides;
/**
 * Created by James on 2/04/2019.
 * AJ TECHNOLOGIES LTD
 */

@Module
public class TokenFunctionModule
{
    @Provides
    TokenFunctionViewModelFactory provideTokenFunctionViewModelFactory(
            AssetDefinitionService assetDefinitionService,
            CreateTransactionInteract createTransactionInteract,
            GasService gasService,
            TokensService tokensService,
            EthereumNetworkRepositoryType ethereumNetworkRepository,
            KeyService keyService,
            GenericWalletInteract genericWalletInteract,
            OpenSeaService openseaService,
            FetchTransactionsInteract fetchTransactionsInteract,
            AnalyticsServiceType analyticsServiceType) {

        return new TokenFunctionViewModelFactory(
                assetDefinitionService, createTransactionInteract, gasService, tokensService, ethereumNetworkRepository, keyService, genericWalletInteract, openseaService, fetchTransactionsInteract, analyticsServiceType);
    }

    @Provides
    TransferTicketDetailRouter provideTransferTicketRouter() {
        return new TransferTicketDetailRouter();
    }

    @Provides
    CreateTransactionInteract provideCreateTransactionInteract(TransactionRepositoryType transactionRepository) {
        return new CreateTransactionInteract(transactionRepository);
    }

    @Provides
    GenericWalletInteract provideGenericWalletInteract(WalletRepositoryType walletRepository) {
        return new GenericWalletInteract(walletRepository);
    }

    @Provides
    FetchTransactionsInteract provideFetchTransactionsInteract(TransactionRepositoryType transactionRepository,
                                                               TokenRepositoryType tokenRepositoryType) {
        return new FetchTransactionsInteract(transactionRepository, tokenRepositoryType);
    }
}
