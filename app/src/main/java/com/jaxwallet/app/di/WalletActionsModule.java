package com.jaxwallet.app.di;

import dagger.Module;
import dagger.Provides;
import com.jaxwallet.app.interact.DeleteWalletInteract;
import com.jaxwallet.app.interact.ExportWalletInteract;
import com.jaxwallet.app.interact.FetchWalletsInteract;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.router.HomeRouter;
import com.jaxwallet.app.viewmodel.WalletActionsViewModelFactory;

@Module
class WalletActionsModule {
	@Provides
	WalletActionsViewModelFactory provideWalletActionsViewModelFactory(
			HomeRouter homeRouter,
			DeleteWalletInteract deleteWalletInteract,
			ExportWalletInteract exportWalletInteract,
			FetchWalletsInteract fetchWalletsInteract) {
		return new WalletActionsViewModelFactory(
				homeRouter,
				deleteWalletInteract,
				exportWalletInteract,
				fetchWalletsInteract);
	}

	@Provides
	HomeRouter provideHomeRouter() {
		return new HomeRouter();
	}

	@Provides
	DeleteWalletInteract provideDeleteAccountInteract(
			WalletRepositoryType accountRepository) {
		return new DeleteWalletInteract(accountRepository);
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
