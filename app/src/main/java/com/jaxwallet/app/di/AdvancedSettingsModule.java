package com.jaxwallet.app.di;

import com.jaxwallet.app.repository.CurrencyRepository;
import com.jaxwallet.app.repository.CurrencyRepositoryType;
import com.jaxwallet.app.repository.LocaleRepository;
import com.jaxwallet.app.repository.LocaleRepositoryType;
import com.jaxwallet.app.repository.PreferenceRepositoryType;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TransactionsService;
import com.jaxwallet.app.viewmodel.AdvancedSettingsViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class AdvancedSettingsModule {
    @Provides
    AdvancedSettingsViewModelFactory provideAdvancedSettingsViewModelFactory(
            LocaleRepositoryType localeRepository,
            CurrencyRepositoryType currencyRepository,
            AssetDefinitionService assetDefinitionService,
            PreferenceRepositoryType preferenceRepository,
            TransactionsService transactionsService
    ) {
        return new AdvancedSettingsViewModelFactory(
                localeRepository,
                currencyRepository,
                assetDefinitionService,
                preferenceRepository,
                transactionsService);
    }

    @Provides
    LocaleRepositoryType provideLocaleRepository(PreferenceRepositoryType preferenceRepository) {
        return new LocaleRepository(preferenceRepository);
    }

    @Provides
    CurrencyRepositoryType provideCurrencyRepository(PreferenceRepositoryType preferenceRepository) {
        return new CurrencyRepository(preferenceRepository);
    }
}
