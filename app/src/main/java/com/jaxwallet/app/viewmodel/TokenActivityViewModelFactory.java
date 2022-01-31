package com.jaxwallet.app.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.jaxwallet.app.interact.FetchTransactionsInteract;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;

import io.reactivex.annotations.NonNull;

public class TokenActivityViewModelFactory implements ViewModelProvider.Factory {

    private final AssetDefinitionService assetDefinitionService;
    private final FetchTransactionsInteract fetchTransactionsInteract;
    private final TokensService tokensService;

    public TokenActivityViewModelFactory(AssetDefinitionService assetDefinitionService,
                                         FetchTransactionsInteract fetchTransactionsInteract,
                                         TokensService tokensService)
    {
        this.assetDefinitionService = assetDefinitionService;
        this.fetchTransactionsInteract = fetchTransactionsInteract;
        this.tokensService = tokensService;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass)
    {
        return (T) new TokenActivityViewModel(assetDefinitionService, fetchTransactionsInteract, tokensService);
    }
}
