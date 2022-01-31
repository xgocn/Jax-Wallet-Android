package com.jaxwallet.app.di;

import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.viewmodel.CustomNetworkViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class CustomNetworkModule {
    @Provides
    CustomNetworkViewModelFactory provideSelectNetworkViewModelFactory(EthereumNetworkRepositoryType networkRepositoryType)
    {
        return new CustomNetworkViewModelFactory(networkRepositoryType);
    }
}
