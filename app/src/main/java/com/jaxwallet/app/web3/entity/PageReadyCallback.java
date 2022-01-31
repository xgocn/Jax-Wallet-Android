package com.jaxwallet.app.web3.entity;

import android.webkit.WebView;

/**
 * Created by James on 3/04/2019.
 * AJ TECHNOLOGIES LTD
 */
public interface PageReadyCallback
{
    void onPageLoaded(WebView view);
    void onPageRendered(WebView view);
    default boolean overridePageLoad(WebView view, String url) { return true; }; //by default, don't allow TokenScript to access any URL
}
