package com.jaxwallet.app.ui.widget;

import com.jaxwallet.app.entity.tokens.Token;

public interface OnTokenManageClickListener
{
    void onTokenClick(Token token, int position, boolean isChecked);
}
