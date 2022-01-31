package com.jaxwallet.app.di;

import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.GasSettingsViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class GasSettingsModule {

    @Provides
    public GasSettingsViewModelFactory provideGasSettingsViewModelFactory(TokensService svs) {
        return new GasSettingsViewModelFactory(svs);
    }
}
