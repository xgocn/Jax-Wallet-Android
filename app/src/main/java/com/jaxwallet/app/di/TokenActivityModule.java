package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.FetchTransactionsInteract;
import com.jaxwallet.app.repository.TokenRepositoryType;
import com.jaxwallet.app.repository.TransactionRepositoryType;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.TokenActivityViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class TokenActivityModule {
    @Provides
    TokenActivityViewModelFactory provideTokenActivityViewModelFactory(AssetDefinitionService assetDefinitionService,
                                                                       FetchTransactionsInteract fetchTransactionsInteract,
                                                                       TokensService tokensService)
    {
        return new TokenActivityViewModelFactory(
                assetDefinitionService,
                fetchTransactionsInteract,
                tokensService);
    }

    @Provides
    FetchTransactionsInteract provideFetchTransactionsInteract(TransactionRepositoryType transactionRepositoryType,
                                                               TokenRepositoryType tokenRepositoryType)
    {
        return new FetchTransactionsInteract(transactionRepositoryType, tokenRepositoryType);
    }
}
