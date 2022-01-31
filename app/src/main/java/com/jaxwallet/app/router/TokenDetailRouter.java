package com.jaxwallet.app.router;


import android.app.Activity;
import android.content.Intent;

import com.jaxwallet.app.C;
import com.jaxwallet.app.ui.Erc1155Activity;
import com.jaxwallet.app.entity.tokens.Token;
import com.jaxwallet.app.entity.Wallet;
import com.jaxwallet.app.ui.Erc20DetailActivity;

public class TokenDetailRouter
{
    public void open(Activity context, String address, String symbol, int decimals, boolean isToken, Wallet wallet, Token token, boolean hasDefinition)
    {
        Intent intent = new Intent(context, Erc20DetailActivity.class);
        intent.putExtra(C.EXTRA_SENDING_TOKENS, isToken);
        intent.putExtra(C.EXTRA_CONTRACT_ADDRESS, address);
        intent.putExtra(C.EXTRA_SYMBOL, symbol);
        intent.putExtra(C.EXTRA_DECIMALS, decimals);
        intent.putExtra(C.Key.WALLET, wallet);
        intent.putExtra(C.EXTRA_CHAIN_ID, token.tokenInfo.chainId);
        intent.putExtra(C.EXTRA_ADDRESS, token.getAddress());
        intent.setFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.putExtra(C.EXTRA_HAS_DEFINITION, hasDefinition);
        context.startActivityForResult(intent, C.TOKEN_SEND_ACTIVITY);
    }

    public void openERC1155(Activity context, Token token, Wallet wallet, boolean hasDefinition)
    {
        Intent intent = new Intent(context, Erc1155Activity.class);
        intent.putExtra(C.EXTRA_SENDING_TOKENS, true);
        intent.putExtra(C.EXTRA_CONTRACT_ADDRESS, token.getAddress());
        intent.putExtra(C.EXTRA_SYMBOL, token.getSymbol());
        intent.putExtra(C.EXTRA_DECIMALS, 0);
        intent.putExtra(C.Key.WALLET, wallet);
        intent.putExtra(C.EXTRA_CHAIN_ID, token.tokenInfo.chainId);
        intent.putExtra(C.EXTRA_ADDRESS, token.getAddress());
        intent.setFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        intent.putExtra(C.EXTRA_HAS_DEFINITION, hasDefinition);
        context.startActivityForResult(intent, C.TOKEN_SEND_ACTIVITY);
    }
}
