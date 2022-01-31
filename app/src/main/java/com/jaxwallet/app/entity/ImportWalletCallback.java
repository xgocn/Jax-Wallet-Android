package com.jaxwallet.app.entity;
import com.jaxwallet.app.entity.cryptokeys.KeyEncodingType;
import com.jaxwallet.app.service.KeyService;

public interface ImportWalletCallback
{
    void walletValidated(String address, KeyEncodingType type, KeyService.AuthenticationLevel level);
}
