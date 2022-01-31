package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.FetchWalletsInteract;
import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.repository.CurrencyRepository;
import com.jaxwallet.app.repository.CurrencyRepositoryType;
import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.repository.LocaleRepository;
import com.jaxwallet.app.repository.LocaleRepositoryType;
import com.jaxwallet.app.repository.PreferenceRepositoryType;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.router.ExternalBrowserRouter;
import com.jaxwallet.app.router.ImportTokenRouter;
import com.jaxwallet.app.router.MyAddressRouter;
import com.jaxwallet.app.service.AnalyticsServiceType;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TickerService;
import com.jaxwallet.app.service.TransactionsService;
import com.jaxwallet.app.viewmodel.HomeViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class HomeModule {
    @Provides
    HomeViewModelFactory provideHomeViewModelFactory(
            PreferenceRepositoryType preferenceRepository,
            LocaleRepositoryType localeRepository,
            ImportTokenRouter importTokenRouter,
            AssetDefinitionService assetDefinitionService,
            GenericWalletInteract genericWalletInteract,
            FetchWalletsInteract fetchWalletsInteract,
            CurrencyRepositoryType currencyRepository,
            EthereumNetworkRepositoryType ethereumNetworkRepository,
            MyAddressRouter myAddressRouter,
            TransactionsService transactionsService,
            TickerService tickerService,
            AnalyticsServiceType analyticsService,
            ExternalBrowserRouter externalBrowserRouter) {
        return new HomeViewModelFactory(
                preferenceRepository,
                localeRepository,
                importTokenRouter,
                assetDefinitionService,
                genericWalletInteract,
                fetchWalletsInteract,
                currencyRepository,
                ethereumNetworkRepository,
                myAddressRouter,
                transactionsService,
                tickerService,
                analyticsService,
                externalBrowserRouter);
    }

    @Provides
    LocaleRepositoryType provideLocaleRepository(PreferenceRepositoryType preferenceRepository) {
        return new LocaleRepository(preferenceRepository);
    }

    @Provides
    ImportTokenRouter providesImportTokenRouter() { return new ImportTokenRouter(); }

    @Provides
    GenericWalletInteract provideFindDefaultWalletInteract(WalletRepositoryType walletRepository) {
        return new GenericWalletInteract(walletRepository);
    }

    @Provides
    FetchWalletsInteract provideFetchWalletInteract(WalletRepositoryType walletRepository) {
        return new FetchWalletsInteract(walletRepository);
    }

    @Provides
    CurrencyRepositoryType provideCurrencyRepository(PreferenceRepositoryType preferenceRepository) {
        return new CurrencyRepository(preferenceRepository);
    }

    @Provides
    MyAddressRouter provideMyAddressRouter() {
        return new MyAddressRouter();
    }

    @Provides
    ExternalBrowserRouter provideBrowserRouter() {
        return new ExternalBrowserRouter();
    }
}
