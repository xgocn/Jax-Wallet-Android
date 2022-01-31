package com.jaxwallet.app.entity;

import com.jaxwallet.app.web3.entity.Web3Transaction;

/**
 * Created by James on 26/01/2019.
 * AJ TECHNOLOGIES LTD
 */
public interface SendTransactionInterface
{
    void transactionSuccess(Web3Transaction web3Tx, String hashData);
    void transactionError(long callbackId, Throwable error);
}
