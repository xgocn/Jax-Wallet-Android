package com.jaxwallet.app.entity;

/**
 * Created by James on 19/07/2019.
 * AJ TECHNOLOGIES LTD
 */
public interface PinAuthenticationCallbackInterface
{
    void completeAuthentication(Operation taskCode);
    void failedAuthentication(Operation taskCode);
}
