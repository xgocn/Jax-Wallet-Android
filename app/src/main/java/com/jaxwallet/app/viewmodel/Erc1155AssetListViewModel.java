package com.jaxwallet.app.viewmodel;

import android.content.Context;
import android.content.Intent;

import com.jaxwallet.app.C;
import com.jaxwallet.app.entity.Wallet;
import com.jaxwallet.app.entity.nftassets.NFTAsset;
import com.jaxwallet.app.entity.tokens.ERC1155Token;
import com.jaxwallet.app.entity.tokens.Token;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.ui.Erc1155AssetDetailActivity;
import com.jaxwallet.app.ui.Erc1155AssetSelectActivity;
import com.jaxwallet.app.util.Utils;

import java.math.BigInteger;

public class Erc1155AssetListViewModel extends BaseViewModel {
    private final AssetDefinitionService assetDefinitionService;
    private final TokensService tokensService;

    public Erc1155AssetListViewModel(
            AssetDefinitionService assetDefinitionService,
            TokensService tokensService)
    {
        this.assetDefinitionService = assetDefinitionService;
        this.tokensService = tokensService;
    }

    public AssetDefinitionService getAssetDefinitionService() {
        return assetDefinitionService;
    }

    public TokensService getTokensService() { return tokensService; }

    public Intent showAssetDetailsIntent(Context context, Wallet wallet, Token token, BigInteger tokenId)
    {
        Intent intent = new Intent(context, Erc1155AssetDetailActivity.class);
        intent.putExtra(C.Key.WALLET, wallet);
        intent.putExtra(C.EXTRA_CHAIN_ID, token.tokenInfo.chainId);
        intent.putExtra(C.EXTRA_ADDRESS, token.getAddress());
        intent.putExtra(C.EXTRA_TOKEN_ID, tokenId.toString());
        intent.putExtra(C.EXTRA_STATE, ERC1155Token.getNFTTokenId(tokenId).toString());
        return intent;
    }

    public Intent openSelectionModeIntent(Context context, Token token, Wallet wallet, NFTAsset asset)
    {
        Intent intent = new Intent(context, Erc1155AssetSelectActivity.class);
        intent.putExtra(C.EXTRA_CHAIN_ID, token.tokenInfo.chainId);
        intent.putExtra(C.EXTRA_ADDRESS, token.getAddress());
        intent.putExtra(C.EXTRA_TOKEN_ID, Utils.bigIntListToString(asset.getCollectionIds(), false));
        intent.putExtra(C.Key.WALLET, wallet);
        return intent;
    }
}
