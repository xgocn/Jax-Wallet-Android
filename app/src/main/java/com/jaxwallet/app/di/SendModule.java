package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.CreateTransactionInteract;
import com.jaxwallet.app.interact.FetchTransactionsInteract;
import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.repository.TokenRepositoryType;
import com.jaxwallet.app.repository.TransactionRepositoryType;
import com.jaxwallet.app.router.MyAddressRouter;
import com.jaxwallet.app.service.AnalyticsServiceType;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.GasService;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.SendViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class SendModule {

    @Provides
    SendViewModelFactory provideSendViewModelFactory(MyAddressRouter myAddressRouter,
                                                     EthereumNetworkRepositoryType networkRepositoryType,
                                                     TokensService tokensService,
                                                     FetchTransactionsInteract fetchTransactionsInteract,
                                                     CreateTransactionInteract createTransactionInteract,
                                                     GasService gasService,
                                                     AssetDefinitionService assetDefinitionService,
                                                     KeyService keyService,
                                                     AnalyticsServiceType analyticsService) {
        return new SendViewModelFactory(myAddressRouter,
                networkRepositoryType,
                tokensService,
                fetchTransactionsInteract,
                createTransactionInteract,
                gasService,
                assetDefinitionService,
                keyService,
                analyticsService);
    }

    @Provides
    MyAddressRouter provideMyAddressRouter() {
        return new MyAddressRouter();
    }

    @Provides
    FetchTransactionsInteract provideFetchTransactionsInteract(TransactionRepositoryType transactionRepository,
                                                               TokenRepositoryType tokenRepositoryType) {
        return new FetchTransactionsInteract(transactionRepository, tokenRepositoryType);
    }

    @Provides
    CreateTransactionInteract provideCreateTransactionInteract(TransactionRepositoryType transactionRepository)
    {
        return new CreateTransactionInteract(transactionRepository);
    }
}
