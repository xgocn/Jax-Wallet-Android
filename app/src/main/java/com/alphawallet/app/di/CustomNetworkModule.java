package com.alphawallet.app.di;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.viewmodel.CustomNetworkViewModelFactory;

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
