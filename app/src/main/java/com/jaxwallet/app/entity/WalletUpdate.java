package com.jaxwallet.app.entity;

import java.util.Map;

/**
 * Created by James on 8/11/2018.
 * AJ TECHNOLOGIES LTD
 */

public class WalletUpdate
{
    public long lastBlock;
    public Map<String, Wallet> wallets;

    public WalletUpdate()
    {
        lastBlock = -1L;
    }
}
