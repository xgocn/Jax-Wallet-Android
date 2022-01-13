package com.alphawallet.app.widget;

import android.content.Context;

import androidx.annotation.NonNull;

import com.alphawallet.app.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class ConfirmWaitingSwapDialog extends BottomSheetDialog {
    public ConfirmWaitingSwapDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.dialog_swap_waiting_confirmation);
    }
}
