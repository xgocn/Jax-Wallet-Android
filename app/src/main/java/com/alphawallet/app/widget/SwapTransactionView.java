package com.alphawallet.app.widget;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alphawallet.app.R;

public class SwapTransactionView extends LinearLayout {
    private TextView tvHeader, tvToken, tvAmount;

    public SwapTransactionView(Context context) {
        super(context);

        inflate(context, R.layout.item_swap_transaction, this);

        tvHeader = findViewById(R.id.tv_header);
        tvToken = findViewById(R.id.tv_name);
        tvAmount = findViewById(R.id.tv_amount);
    }
}
