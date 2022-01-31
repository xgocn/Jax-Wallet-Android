package com.jaxwallet.app.di;

import dagger.Module;
import dagger.Provides;

import com.jaxwallet.app.interact.ExportWalletInteract;
import com.jaxwallet.app.interact.FetchWalletsInteract;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.viewmodel.BackupKeyViewModelFactory;

@Module
public class BackupKeyModule {
    @Provides
    BackupKeyViewModelFactory provideBackupKeyViewModelFactory(
            KeyService keyService,
            ExportWalletInteract exportWalletInteract,
            FetchWalletsInteract fetchWalletsInteract) {
        return new BackupKeyViewModelFactory(
                keyService,
                exportWalletInteract,
                fetchWalletsInteract);
    }

    @Provides
    ExportWalletInteract provideExportWalletInteract(
            WalletRepositoryType walletRepository) {
        return new ExportWalletInteract(walletRepository);
    }

    @Provides
    FetchWalletsInteract provideFetchAccountsInteract(WalletRepositoryType accountRepository) {
        return new FetchWalletsInteract(accountRepository);
    }
}