package com.jaxwallet.app.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;

import com.jaxwallet.app.interact.CreateTransactionInteract;
import com.jaxwallet.app.interact.FindDefaultNetworkInteract;
import com.jaxwallet.app.router.SellDetailRouter;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.service.TokensService;

/**
 * Created by James on 21/02/2018.
 */

public class SellDetailModelFactory implements ViewModelProvider.Factory {

    private FindDefaultNetworkInteract findDefaultNetworkInteract;
    private TokensService tokensService;
    private CreateTransactionInteract createTransactionInteract;
    private SellDetailRouter sellDetailRouter;
    private KeyService keyService;
    private AssetDefinitionService assetDefinitionService;

    public SellDetailModelFactory(FindDefaultNetworkInteract findDefaultNetworkInteract,
                                  TokensService tokensService,
                                  CreateTransactionInteract createTransactionInteract,
                                  SellDetailRouter sellDetailRouter,
                                  KeyService keyService,
                                  AssetDefinitionService assetDefinitionService) {
        this.findDefaultNetworkInteract = findDefaultNetworkInteract;
        this.tokensService = tokensService;
        this.createTransactionInteract = createTransactionInteract;
        this.sellDetailRouter = sellDetailRouter;
        this.keyService = keyService;
        this.assetDefinitionService = assetDefinitionService;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new SellDetailViewModel(findDefaultNetworkInteract, tokensService, createTransactionInteract, sellDetailRouter, keyService, assetDefinitionService);
    }
}

