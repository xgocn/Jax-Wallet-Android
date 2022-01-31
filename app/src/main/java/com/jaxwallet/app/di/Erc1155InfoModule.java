package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.FetchTransactionsInteract;
import com.jaxwallet.app.repository.TokenRepositoryType;
import com.jaxwallet.app.repository.TransactionRepositoryType;
import com.jaxwallet.app.router.MyAddressRouter;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.Erc1155InfoViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class Erc1155InfoModule {
    @Provides
    Erc1155InfoViewModelFactory provideErc1155InfoViewModelFactory(FetchTransactionsInteract fetchTransactionsInteract,
                                                                   AssetDefinitionService assetDefinitionService,
                                                                   TokensService tokensService)
    {
        return new Erc1155InfoViewModelFactory(
                fetchTransactionsInteract,
                assetDefinitionService,
                tokensService);
    }

    @Provides
    MyAddressRouter provideMyAddressRouter()
    {
        return new MyAddressRouter();
    }

    @Provides
    FetchTransactionsInteract provideFetchTransactionsInteract(TransactionRepositoryType transactionRepositoryType,
                                                               TokenRepositoryType tokenRepositoryType)
    {
        return new FetchTransactionsInteract(transactionRepositoryType, tokenRepositoryType);
    }
}
