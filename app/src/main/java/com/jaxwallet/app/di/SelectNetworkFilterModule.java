package com.jaxwallet.app.di;

import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.repository.PreferenceRepositoryType;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.SelectNetworkFilterViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class SelectNetworkFilterModule {
    @Provides
    SelectNetworkFilterViewModelFactory provideSelectNetworkFilterViewModelFactory(EthereumNetworkRepositoryType networkRepositoryType,
                                                                                   TokensService tokensService,
                                                                                   PreferenceRepositoryType preferenceRepositoryType) {
        return new SelectNetworkFilterViewModelFactory(networkRepositoryType, tokensService, preferenceRepositoryType);
    }
}
