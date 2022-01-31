package com.jaxwallet.app.di;

import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.viewmodel.TokenScriptManagementViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class TokenScriptManagementModule {
    @Provides
    TokenScriptManagementViewModelFactory tokenScriptManagementViewModelFactory(AssetDefinitionService assetDefinitionService)
    {
        return new TokenScriptManagementViewModelFactory(assetDefinitionService);
    }
}
