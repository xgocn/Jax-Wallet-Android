package com.jaxwallet.app.di;

import android.content.Context;

import com.jaxwallet.app.interact.FetchWalletsInteract;
import com.jaxwallet.app.interact.FindDefaultNetworkInteract;
import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.interact.SetDefaultWalletInteract;
import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.repository.TokenRepositoryType;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.router.HomeRouter;
import com.jaxwallet.app.router.ImportWalletRouter;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.service.TickerService;
import com.jaxwallet.app.viewmodel.WalletsViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
class AccountsManageModule {

	@Provides
	WalletsViewModelFactory provideAccountsManageViewModelFactory(
			SetDefaultWalletInteract setDefaultWalletInteract,
			FetchWalletsInteract fetchWalletsInteract,
			GenericWalletInteract genericWalletInteract,
			ImportWalletRouter importWalletRouter,
			HomeRouter homeRouter,
			FindDefaultNetworkInteract findDefaultNetworkInteract,
			KeyService keyService,
			EthereumNetworkRepositoryType ethereumNetworkRepository,
			TokenRepositoryType tokenRepository,
			TickerService tickerService,
			AssetDefinitionService assetDefinitionService,
			Context context)
	{
		return new WalletsViewModelFactory(setDefaultWalletInteract,
				fetchWalletsInteract,
				genericWalletInteract,
				importWalletRouter,
				homeRouter,
				findDefaultNetworkInteract,
				keyService,
				ethereumNetworkRepository,
				tokenRepository,
				tickerService,
				assetDefinitionService,
				context);
	}

	@Provides
	SetDefaultWalletInteract provideSetDefaultAccountInteract(WalletRepositoryType accountRepository) {
		return new SetDefaultWalletInteract(accountRepository);
	}

	@Provides
	FetchWalletsInteract provideFetchAccountsInteract(WalletRepositoryType accountRepository) {
		return new FetchWalletsInteract(accountRepository);
	}

	@Provides
	GenericWalletInteract provideFindDefaultAccountInteract(WalletRepositoryType accountRepository) {
		return new GenericWalletInteract(accountRepository);
	}

	@Provides
	ImportWalletRouter provideImportAccountRouter() {
		return new ImportWalletRouter();
	}

	@Provides
	HomeRouter provideHomeRouter() {
		return new HomeRouter();
	}

	@Provides
	FindDefaultNetworkInteract provideFindDefaultNetworkInteract(
			EthereumNetworkRepositoryType networkRepository) {
		return new FindDefaultNetworkInteract(networkRepository);
	}
}
