package com.alphawallet.app.di;

import android.content.Context;

import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.WalletRepositoryType;
import com.alphawallet.app.viewmodel.NameThisWalletViewModelFactory;

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
