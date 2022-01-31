package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.ChangeTokenEnableInteract;
import com.jaxwallet.app.repository.TokenRepositoryType;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.TokenManagementViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class TokenManagementModule {
    @Provides
    TokenManagementViewModelFactory provideTokenManagementViewModelFactory(
            TokenRepositoryType tokenRepository,
            ChangeTokenEnableInteract changeTokenEnableInteract,
            AssetDefinitionService assetDefinitionService,
            TokensService tokensService)
    {
        return new TokenManagementViewModelFactory(tokenRepository, changeTokenEnableInteract, assetDefinitionService, tokensService);
    }

    @Provides
    ChangeTokenEnableInteract provideChangeTokenEnableInteract(TokenRepositoryType tokenRepository) {
        return new ChangeTokenEnableInteract(tokenRepository);
    }
}
