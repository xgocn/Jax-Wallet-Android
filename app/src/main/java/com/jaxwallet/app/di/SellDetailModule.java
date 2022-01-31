package com.jaxwallet.app.di;

import com.jaxwallet.app.interact.CreateTransactionInteract;
import com.jaxwallet.app.interact.FindDefaultNetworkInteract;
import com.jaxwallet.app.repository.EthereumNetworkRepositoryType;
import com.jaxwallet.app.repository.TransactionRepositoryType;
import com.jaxwallet.app.router.SellDetailRouter;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.viewmodel.SellDetailModelFactory;

import dagger.Module;
import dagger.Provides;

/**
 * Created by James on 22/02/2018.
 */

@Module
public class SellDetailModule {

    @Provides
    SellDetailModelFactory sellDetailModelFactory(
            FindDefaultNetworkInteract findDefaultNetworkInteract,
            TokensService tokensService,
            CreateTransactionInteract createTransactionInteract,
            SellDetailRouter sellDetailRouter,
            KeyService keyService,
            AssetDefinitionService assetDefinitionService) {
        return new SellDetailModelFactory(
                findDefaultNetworkInteract, tokensService, createTransactionInteract, sellDetailRouter, keyService, assetDefinitionService);
    }

    @Provides
    FindDefaultNetworkInteract provideFindDefaultNetworkInteract(
            EthereumNetworkRepositoryType networkRepository) {
        return new FindDefaultNetworkInteract(networkRepository);
    }

    @Provides
    CreateTransactionInteract provideCreateTransactionInteract(TransactionRepositoryType transactionRepository) {
        return new CreateTransactionInteract(transactionRepository);
    }

    @Provides
    SellDetailRouter provideSellDetailRouter() {
        return new SellDetailRouter();
    }
}
