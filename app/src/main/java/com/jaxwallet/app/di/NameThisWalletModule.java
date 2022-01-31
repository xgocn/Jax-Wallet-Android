package com.jaxwallet.app.di;

import android.content.Context;

import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.viewmodel.NameThisWalletViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class NameThisWalletModule {
    @Provides
    NameThisWalletViewModelFactory provideNameThisWalletViewModelFactory(
            GenericWalletInteract genericWalletInteract, Context context
    ) {
        return new NameThisWalletViewModelFactory(
                genericWalletInteract, context);
    }

    @Provides
    GenericWalletInteract provideFindDefaultWalletInteract(WalletRepositoryType walletRepository) {
        return new GenericWalletInteract(walletRepository);
    }
}
