package com.jaxwallet.app.entity;

/**
 * Created by James on 4/12/2018.
 * AJ TECHNOLOGIES LTD
 */

public interface ENSCallback
{
    void ENSComplete();
    void displayCheckingDialog(boolean shouldShow);
    void ENSResolved(String address, String ens);
    void ENSName(String name);
}
