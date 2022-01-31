package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.repository.PreferenceRepositoryType;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.router.ManageWalletsRouter;
import com.jaxwallet.app.router.MyAddressRouter;
import com.jaxwallet.app.viewmodel.NewSettingsViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class NewSettingsModule {
    @Provides
    NewSettingsViewModelFactory provideNewSettingsViewModelFactory(
            GenericWalletInteract genericWalletInteract,
            MyAddressRouter myAddressRouter,
            ManageWalletsRouter manageWalletsRouter,
            PreferenceRepositoryType preferenceRepository
    ) {
        return new NewSettingsViewModelFactory(
                genericWalletInteract,
                myAddressRouter,
                manageWalletsRouter,
                preferenceRepository);
    }

    @Provides
    GenericWalletInteract provideFindDefaultWalletInteract(WalletRepositoryType walletRepository) {
        return new GenericWalletInteract(walletRepository);
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
