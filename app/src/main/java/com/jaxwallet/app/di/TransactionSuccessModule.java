package com.jaxwallet.app.di;

import com.jaxwallet.app.repository.PreferenceRepositoryType;
import com.jaxwallet.app.viewmodel.TransactionSuccessViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class TransactionSuccessModule {

    @Provides
    TransactionSuccessViewModelFactory provideTransactionSuccessViewModelFactory(PreferenceRepositoryType preferenceRepository) {
        return new TransactionSuccessViewModelFactory(
                preferenceRepository);
    }
}
