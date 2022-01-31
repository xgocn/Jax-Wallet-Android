package com.jaxwallet.app.di;

import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.MyAddressViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class MyAddressModule {
    @Provides
    MyAddressViewModelFactory provideMyAddressViewModelFactory(
            EthereumNetworkRepositoryType ethereumNetworkRepository,
            TokensService tokensService,
            AssetDefinitionService assetDefinitionService) {
        return new MyAddressViewModelFactory(
                ethereumNetworkRepository,
                tokensService,
                assetDefinitionService);
    }
}
