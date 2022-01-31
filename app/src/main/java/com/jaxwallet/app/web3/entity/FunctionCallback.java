package com.jaxwallet.app.web3.entity;

import com.jaxwallet.app.entity.DAppFunction;
import com.jaxwallet.token.entity.Signable;

/**
 * Created by James on 6/04/2019.
 * AJ TECHNOLOGIES LTD
 */
public interface FunctionCallback
{
    void signMessage(Signable sign, DAppFunction dAppFunction);
    void functionSuccess();
    void functionFailed();
}
