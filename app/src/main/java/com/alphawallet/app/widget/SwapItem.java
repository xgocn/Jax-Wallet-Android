package com.alphawallet.app.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.alphawallet.app.R;
import com.alphawallet.app.entity.ItemClick;
import com.alphawallet.app.repository.entity.RealmTokenTicker;
import com.alphawallet.app.ui.widget.adapter.CustomSpinnerAdapter;
import com.alphawallet.app.ui.widget.entity.AmountReadyCallback;
import com.alphawallet.app.ui.widget.entity.NumericInput;
import com.alphawallet.app.ui.widget.entity.SpinnerCallback;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SwapItem extends LinearLayout implements AdapterView.OnItemClickListener{
    private final Context context;
    private TextView tvBalance;
    private NumericInput inputAmount;
    public Spinner tokenSpinner;
    private CustomSpinnerAdapter adapter;

    private SpinnerCallback spinnerCallback;
    private AmountReadyCallback amountReadyCallback;

    private static Integer[] imageIconDatabase = { R.drawable.wjxn, R.drawable.jusd, R.drawable.jinr};
    private String[] imageNameDatabase = { "WJXN", "J-USD", "J-INR"};
    List<HashMap> spinnerList = new ArrayList<>();

    public SwapItem(Context context) {
        super(context);
        this.context = context;

        inflate(context, R.layout.item_swap, this);

        tvBalance = findViewById(R.id.tv_balance);
        inputAmount = findViewById(R.id.amount_entry);
        tokenSpinner = findViewById(R.id.spinner_token);

        setupSpinner();

        setupViewListeners();
    }

    public void setupCallback(@NotNull SpinnerCallback callback, @NotNull AmountReadyCallback amountCallback) {
        this.spinnerCallback = callback;
        this.amountReadyCallback = amountCallback;
    }

    public void setTokenBalance(String balance) {
        tvBalance.setText(balance);
    }

    private void setupSpinner() {
        for (int i = 0; i < imageNameDatabase.length; i++) {
            HashMap map = new HashMap<String, Object>();


            map.put("Name", imageNameDatabase[i]);
            map.put("Icon", imageIconDatabase[i]);
            spinnerList.add(map);
        }

        CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(this.context,
                (List<? extends Map<String, ?>>) spinnerList, R.layout.item_spinner_view, new String[] { "Name",
                "Icon" }, new int[] { R.id.imageNameSpinner,
                R.id.imageIconSpinner });
        tokenSpinner.setAdapter(adapter);
    }

    private void setupViewListeners()
    {
        LinearLayout clickMore = findViewById(R.id.layout_more_click);

        inputAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (inputAmount.hasFocus())
                {
                    amountReadyCallback.amountReady(new BigDecimal(s.toString()), new BigDecimal("0.0"));
//                    exactAmount = BigDecimal.ZERO; //invalidate the 'all funds' amount
                    showError(false, 0);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (inputAmount.hasFocus())
                {

//                    amountReadyCallback.updateCryptoAmount(getWeiInputAmount());
                }
            }
        });

        inputAmount.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus)
            {
                showError(false, 0);
            }
        });

        inputAmount.setOnClickListener(v -> {
            showError(false, 0);
        });

    }

    public void showError(boolean showError, int customError)
    {
        TextView errorText = findViewById(R.id.text_error);
        if (customError != 0)
        {
            errorText.setText(customError);
        }
        else
        {
//            errorText.setText(String.format(getResources().getString(R.string.error_insufficient_funds), token.getSymbolOrShortName()));
        }

        if (showError)
        {
            errorText.setVisibility(View.VISIBLE);
            inputAmount.setTextColor(context.getColor(R.color.danger));
        }
        else
        {
            errorText.setVisibility(View.GONE);
            inputAmount.setTextColor(context.getColor(R.color.text_black));
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ItemClick action = (ItemClick) adapter.getItem(position);
        spinnerCallback.clickItem(action, position);
    }
}
