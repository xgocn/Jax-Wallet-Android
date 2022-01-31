package com.jaxwallet.app.web3;

import com.jaxwallet.token.entity.EthereumMessage;

public interface OnSignMessageListener {
    void onSignMessage(EthereumMessage message);
}
