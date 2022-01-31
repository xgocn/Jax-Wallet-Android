package com.jaxwallet.app.di;


import com.jaxwallet.app.interact.ChangeTokenEnableInteract;
import com.jaxwallet.app.interact.FetchTokensInteract;
import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.repository.PreferenceRepositoryType;
import com.jaxwallet.app.repository.TokenRepositoryType;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.router.AssetDisplayRouter;
import com.jaxwallet.app.router.ManageWalletsRouter;
import com.jaxwallet.app.router.TokenDetailRouter;
import com.jaxwallet.app.router.MyAddressRouter;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.WalletViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class WalletModule {
    @Provides
    WalletViewModelFactory provideWalletViewModelFactory(
            FetchTokensInteract fetchTokensInteract,
            TokenDetailRouter tokenDetailRouter,
            AssetDisplayRouter assetDisplayRouter,
            GenericWalletInteract genericWalletInteract,
            AssetDefinitionService assetDefinitionService,
            TokensService tokensService,
            ChangeTokenEnableInteract changeTokenEnableInteract,
            MyAddressRouter myAddressRouter,
            ManageWalletsRouter manageWalletsRouter,
            PreferenceRepositoryType preferenceRepository) {
        return new WalletViewModelFactory(
                fetchTokensInteract,
                tokenDetailRouter,
                assetDisplayRouter,
                genericWalletInteract,
                assetDefinitionService,
                tokensService,
                changeTokenEnableInteract,
                myAddressRouter,
                manageWalletsRouter,
                preferenceRepository);
    }

    @Provides
    FetchTokensInteract provideFetchTokensInteract(TokenRepositoryType tokenRepository) {
        return new FetchTokensInteract(tokenRepository);
    }

    @Provides
    TokenDetailRouter provideErc20DetailRouterRouter() {
        return new TokenDetailRouter();
    }

    @Provides
    AssetDisplayRouter provideAssetDisplayRouter() {
        return new AssetDisplayRouter();
    }

    @Provides
    GenericWalletInteract provideGenericWalletInteract(WalletRepositoryType walletRepository) {
        return new GenericWalletInteract(walletRepository);
    }

    @Provides
    ChangeTokenEnableInteract provideChangeTokenEnableInteract(TokenRepositoryType tokenRepository) {
        return new ChangeTokenEnableInteract(tokenRepository);
    }

    @Provides
    MyAddressRouter provideMyAddressRouter() {
        return new MyAddressRouter();
    }

    @Provides
    ManageWalletsRouter provideManageWalletsRouter() {
        return new ManageWalletsRouter();
    }
}
