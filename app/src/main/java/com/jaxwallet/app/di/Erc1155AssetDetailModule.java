package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.Erc1155AssetDetailViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class Erc1155AssetDetailModule {
    @Provides
    Erc1155AssetDetailViewModelFactory provideErc1155AssetDetailViewModelFactory(
            AssetDefinitionService assetDefinitionService,
            TokensService tokensService,
            GenericWalletInteract walletInteract)
    {
        return new Erc1155AssetDetailViewModelFactory(assetDefinitionService, tokensService, walletInteract);
    }

    @Provides
    GenericWalletInteract provideFindDefaultWalletInteract(WalletRepositoryType walletRepository)
    {
        return new GenericWalletInteract(walletRepository);
    }
}
