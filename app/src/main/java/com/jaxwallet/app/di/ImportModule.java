package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.ImportWalletInteract;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.service.AnalyticsServiceType;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.viewmodel.ImportWalletViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class ImportModule {
    @Provides
    ImportWalletViewModelFactory provideImportWalletViewModelFactory(
            ImportWalletInteract importWalletInteract,
            KeyService keyService,
            AnalyticsServiceType analyticsService) {
        return new ImportWalletViewModelFactory(importWalletInteract, keyService, analyticsService);
    }

    @Provides
    ImportWalletInteract provideImportWalletInteract(
            WalletRepositoryType walletRepository) {
        return new ImportWalletInteract(walletRepository);
    }
}
