package com.jaxwallet.app.entity;

/**
 * Created by James on 9/06/2019.
 * AJ TECHNOLOGIES LTD
 */

public interface AuthenticationCallback
{
    void authenticatePass(Operation callbackId);
    void authenticateFail(String fail, AuthenticationFailType failType, Operation callbackId);
    void legacyAuthRequired(Operation callbackId, String dialogTitle, String desc);
}