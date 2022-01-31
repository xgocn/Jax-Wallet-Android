package com.jaxwallet.app.ui.widget.entity;

import com.jaxwallet.app.entity.Wallet;

/**
 * Created by James on 21/07/2019.
 * AJ TECHNOLOGIES LTD
 */
public interface WalletClickCallback
{
    void onWalletClicked(Wallet wallet);
    void ensAvatar(Wallet wallet);
}
