package com.jaxwallet.app.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.jaxwallet.app.interact.CreateTransactionInteract;
import com.jaxwallet.app.interact.FindDefaultNetworkInteract;
import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.service.AnalyticsServiceType;
import com.jaxwallet.app.service.GasService;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.service.RealmManager;
import com.jaxwallet.app.service.TokensService;

import javax.inject.Inject;

public class WalletConnectViewModelFactory implements ViewModelProvider.Factory {
    private final KeyService keyService;
    private final FindDefaultNetworkInteract findDefaultNetworkInteract;
    private final CreateTransactionInteract createTransactionInteract;
    private final GenericWalletInteract genericWalletInteract;
    private final RealmManager realmManager;
    private final GasService gasService;
    private final TokensService tokensService;
    private final AnalyticsServiceType analyticsService;

    @Inject
    public WalletConnectViewModelFactory(
            KeyService keyService,
            FindDefaultNetworkInteract findDefaultNetworkInteract,
            CreateTransactionInteract createTransactionInteract,
            GenericWalletInteract genericWalletInteract,
            RealmManager realmManager,
            GasService gasService,
            TokensService tokensService,
            AnalyticsServiceType analyticsService) {
        this.keyService = keyService;
        this.findDefaultNetworkInteract = findDefaultNetworkInteract;
        this.createTransactionInteract = createTransactionInteract;
        this.genericWalletInteract = genericWalletInteract;
        this.realmManager = realmManager;
        this.gasService = gasService;
        this.tokensService = tokensService;
        this.analyticsService = analyticsService;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new WalletConnectViewModel(
                keyService,
                findDefaultNetworkInteract,
                createTransactionInteract,
                genericWalletInteract,
                realmManager,
                gasService,
                tokensService,
                analyticsService);
    }
}
