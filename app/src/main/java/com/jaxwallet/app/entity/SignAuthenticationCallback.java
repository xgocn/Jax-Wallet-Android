package com.jaxwallet.app.entity;

import com.jaxwallet.token.entity.Signable;

/**
 * Created by James on 21/07/2019.
 * AJ TECHNOLOGIES LTD
 */
public interface SignAuthenticationCallback
{
    void gotAuthorisation(boolean gotAuth);
    default void gotAuthorisationForSigning(boolean gotAuth, Signable messageToSign) { }; //if you implement message signing
    default void createdKey(String keyAddress) { };
    void cancelAuthentication();
}