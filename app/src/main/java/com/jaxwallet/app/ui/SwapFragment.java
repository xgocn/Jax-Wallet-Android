package com.jaxwallet.app.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.jaxwallet.app.R;
import com.jaxwallet.app.entity.ItemClick;
import com.jaxwallet.app.entity.StandardFunctionInterface;
import com.jaxwallet.app.ui.widget.entity.AmountReadyCallback;
import com.jaxwallet.app.ui.widget.entity.SpinnerCallback;
import com.jaxwallet.app.widget.ConfirmSwapDialog;
import com.jaxwallet.app.widget.FunctionButtonBar;
import com.jaxwallet.app.widget.SwapItem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapFragment extends Fragment implements SpinnerCallback, StandardFunctionInterface, AmountReadyCallback {

    private FunctionButtonBar functionBar;
    private SwapItem sendItem, receiveItem;
    private TextView tvRate;

    public SwapFragment() {
        // Required empty public constructor
    }

    public static SwapFragment newInstance() {
        SwapFragment fragment = new SwapFragment();
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
        View view = inflater.inflate(R.layout.fragment_swap, container, false);

        sendItem = view.findViewById(R.id.send_item);
        receiveItem = view.findViewById(R.id.receive_item);
        tvRate = view.findViewById(R.id.tv_swap_rate);
        functionBar = view.findViewById(R.id.layoutButtons);

        functionBar.revealButtons();
        List<Integer> functions = new ArrayList<>(Collections.singletonList(R.string.action_token_swap));
        functionBar.setupFunctions(this, functions);
        functionBar.setPrimaryButtonEnabled(false);

        sendItem.setupCallback(this, this);
        receiveItem.setupCallback(this, this);

        return view;
    }

    @Override
    public void clickItem(ItemClick item, int position) {

        if(sendItem.tokenSpinner.getSelectedItemPosition() == receiveItem.tokenSpinner.getSelectedItemPosition()) {
            Toast.makeText(getActivity(), "Select other token.", Toast.LENGTH_SHORT).show();
        } else {
            if(sendItem.tokenSpinner.getSelectedItemPosition() == position) {
                sendItem.setTokenBalance("0.00");
            } else {
                receiveItem.setTokenBalance("0.00");
            }
        }

//        tvRate.setText(""); // need
    }

    @Override
    public void handleClick(String action, int actionId) {
        ConfirmSwapDialog dialog = new ConfirmSwapDialog(getActivity());
        dialog.show();
    }

    @Override
    public void amountReady(BigDecimal value, BigDecimal gasFee) {
        Log.d("swap id", this.getId()+"");
        functionBar.setPrimaryButtonEnabled(true);
    }
}