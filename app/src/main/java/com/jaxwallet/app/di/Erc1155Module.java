package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.FetchTransactionsInteract;
import com.jaxwallet.app.repository.TokenRepositoryType;
import com.jaxwallet.app.repository.TransactionRepositoryType;
import com.jaxwallet.app.router.MyAddressRouter;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.Erc1155ViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class Erc1155Module {
    @Provides
    Erc1155ViewModelFactory provideErc1155ViewModelFactory(FetchTransactionsInteract fetchTransactionsInteract,
                                                               AssetDefinitionService assetDefinitionService,
                                                               TokensService tokensService)
    {
        return new Erc1155ViewModelFactory(
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
