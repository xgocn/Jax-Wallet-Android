package com.alphawallet.app.widget;

import android.content.Context;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.alphawallet.app.R;
import com.alphawallet.app.entity.StandardFunctionInterface;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConfirmSwapDialog extends BottomSheetDialog implements StandardFunctionInterface {
    private FunctionButtonBar functionBar;
    private SwapTransactionView fromView, toView;
    private TextView tvPrice, tvTxFee, tvMarkupFee;

    public ConfirmSwapDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.dialog_swap_confirmation);

        fromView = findViewById(R.id.from_view);
        toView = findViewById(R.id.to_view);
        tvPrice = findViewById(R.id.swap_price);
        tvTxFee = findViewById(R.id.tv_transaction_fee);
        tvMarkupFee = findViewById(R.id.tv_markup_fee);
        functionBar = findViewById(R.id.layoutButtons);

        functionBar.revealButtons();
        List<Integer> functions = new ArrayList<>(Collections.singletonList(R.string.confirm_swap));
        functionBar.setupFunctions(this, functions);
        functionBar.setPrimaryButtonEnabled(false);
    }

    @Override
    public void handleClick(String action, int actionId) {

    }
}
