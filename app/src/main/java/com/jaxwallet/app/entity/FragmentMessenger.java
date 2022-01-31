package com.jaxwallet.app.entity;

/**
 * Created by James on 1/02/2019.
 * AJ TECHNOLOGIES LTD
 */
public interface FragmentMessenger
{
    void tokenScriptError(String message);
    void updateReady(int versionUpdate);
}
