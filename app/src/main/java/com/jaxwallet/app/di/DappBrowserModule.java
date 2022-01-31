package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.CreateTransactionInteract;
import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.repository.TransactionRepositoryType;
import com.jaxwallet.app.repository.WalletRepositoryType;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.GasService;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.DappBrowserViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class DappBrowserModule {
    @Provides
    DappBrowserViewModelFactory provideWalletViewModelFactory(
            GenericWalletInteract genericWalletInteract,
            AssetDefinitionService assetDefinitionService,
            CreateTransactionInteract createTransactionInteract,
            TokensService tokensService,
            EthereumNetworkRepositoryType ethereumNetworkRepository,
            KeyService keyService,
            GasService gasService) {
        return new DappBrowserViewModelFactory(
                genericWalletInteract,
                assetDefinitionService,
                createTransactionInteract,
                tokensService,
                ethereumNetworkRepository,
                keyService,
                gasService);
    }

    @Provides
    GenericWalletInteract provideFindDefaultWalletInteract(WalletRepositoryType walletRepository)
    {
        return new GenericWalletInteract(walletRepository);
    }

    @Provides
    CreateTransactionInteract provideCreateTransactionInteract(TransactionRepositoryType transactionRepository) {
        return new CreateTransactionInteract(transactionRepository);
    }
}
