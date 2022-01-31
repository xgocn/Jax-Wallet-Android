package com.jaxwallet.app.viewmodel;

/**
 * Created by James on 25/01/2018.
 */

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;

import com.jaxwallet.app.interact.CreateTransactionInteract;
import com.jaxwallet.app.interact.FetchTokensInteract;
import com.jaxwallet.app.interact.GenericWalletInteract;
import com.jaxwallet.app.interact.MemPoolInteract;
import com.jaxwallet.app.interact.SignatureGenerateInteract;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.KeyService;
import com.jaxwallet.app.service.TokensService;

/**
 * Created by James on 22/01/2018.
 */

public class RedeemSignatureDisplayModelFactory implements ViewModelProvider.Factory {

    private final GenericWalletInteract genericWalletInteract;
    private final KeyService keyService;
    private final SignatureGenerateInteract signatureGenerateInteract;
    private final CreateTransactionInteract createTransactionInteract;
    private final FetchTokensInteract fetchTokensInteract;
    private final MemPoolInteract memPoolInteract;
    private final TokensService tokensService;
    private final AssetDefinitionService assetDefinitionService;

    public RedeemSignatureDisplayModelFactory(
            GenericWalletInteract genericWalletInteract,
            SignatureGenerateInteract signatureGenerateInteract,
            CreateTransactionInteract createTransactionInteract,
            KeyService keyService,
            FetchTokensInteract fetchTokensInteract,
            MemPoolInteract memPoolInteract,
            TokensService tokensService,
            AssetDefinitionService assetDefinitionService) {
        this.genericWalletInteract = genericWalletInteract;
        this.keyService = keyService;
        this.signatureGenerateInteract = signatureGenerateInteract;
        this.createTransactionInteract = createTransactionInteract;
        this.fetchTokensInteract = fetchTokensInteract;
        this.memPoolInteract = memPoolInteract;
        this.tokensService = tokensService;
        this.assetDefinitionService = assetDefinitionService;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new RedeemSignatureDisplayModel(genericWalletInteract, signatureGenerateInteract, createTransactionInteract, keyService, fetchTokensInteract, memPoolInteract, tokensService, assetDefinitionService);
    }
}
