package com.jaxwallet.app.ui;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.jaxwallet.app.R;
import com.jaxwallet.app.repository.EthereumNetworkBase;

public class BrowserFragment extends BaseFragment {

    public BrowserFragment() {
        // Required empty public constructor
    }

    public static BrowserFragment newInstance() {
        BrowserFragment fragment = new BrowserFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_browser, container, false);

        WebView webView = view.findViewById(R.id.webview);
        webView.loadUrl(EthereumNetworkBase.DEFAULT_HOMEPAGE);
        webView.clearHistory();
        webView.clearCache(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        return view;
    }
}