package com.jaxwallet.app.ui.widget;

import java.io.Serializable;

import com.jaxwallet.app.entity.DApp;

public interface OnDappClickListener extends Serializable {
    void onDappClick(DApp dapp);
}
