package com.jaxwallet.app.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.repository.PreferenceRepositoryType;
import com.jaxwallet.app.service.TokensService;

import io.reactivex.annotations.NonNull;

public class SelectNetworkFilterViewModelFactory implements ViewModelProvider.Factory {

    private final EthereumNetworkRepositoryType networkRepository;
    private final TokensService tokensService;
    private final PreferenceRepositoryType preferenceRepository;

    public SelectNetworkFilterViewModelFactory(EthereumNetworkRepositoryType networkRepository,
                                               TokensService tokensService,
                                               PreferenceRepositoryType preferenceRepository) {
        this.networkRepository = networkRepository;
        this.tokensService = tokensService;
        this.preferenceRepository = preferenceRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new SelectNetworkFilterViewModel(networkRepository, tokensService, preferenceRepository);
    }
}
