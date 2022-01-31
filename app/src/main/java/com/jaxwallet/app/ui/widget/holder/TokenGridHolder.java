package com.jaxwallet.app.ui.widget.holder;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jaxwallet.app.R;
import com.jaxwallet.app.entity.tokens.Token;
import com.jaxwallet.app.entity.tokens.TokenCardMeta;
import com.jaxwallet.app.service.AssetDefinitionService;
import com.jaxwallet.app.service.TokensService;
import com.jaxwallet.app.ui.widget.OnTokenClickListener;
import com.jaxwallet.app.widget.TokenIcon;

public class TokenGridHolder extends BinderViewHolder<TokenCardMeta> {

    public static final int VIEW_TYPE = 2005;

    private final LinearLayout clickLayer;
    private final TextView name;
    private final TokenIcon imageIcon;
    private final AssetDefinitionService assetDefinition;
    private final TokensService tokensService;

    private OnTokenClickListener onTokenClickListener;

    public TokenGridHolder(int resId, ViewGroup parent, AssetDefinitionService assetService, TokensService tSvs) {
        super(resId, parent);

        clickLayer = findViewById(R.id.click_layer);
        imageIcon = findViewById(R.id.token_icon);
        name = findViewById(R.id.token_name);
        tokensService = tSvs;
        assetDefinition = assetService;
    }

    @Override
    public void bind(@Nullable TokenCardMeta tcm, @NonNull Bundle addition) {
        if (tcm != null) {
            Token token = tokensService.getToken(tcm.getChain(), tcm.getAddress());
            imageIcon.bindData(token, assetDefinition);
            name.setText(token.getFullName(assetDefinition, token.balance.intValue()));

            /*if (token.isERC721()) {
                ERC721Token tkn = (ERC721Token) token;
                Collection<NFTAsset> assets = tkn.getTokenAssets().values();
                if (assets != null && assets.size() > 0) {
                    NFTAsset firstAsset = assets.iterator().next();
                    if (firstAsset != null) {
                        Glide.with(getContext())
                                .load(firstAsset.getThumbnail())
                                .override(72)
                                .into(imageIcon);
                        name.setText(token.tokenInfo.name);
                        textIcon.setVisibility(View.GONE);
                        imageIcon.setVisibility(View.VISIBLE);
                    } else {
                        setupIcon(token);
                    }
                }
            } else if (token.isERC721Ticket()) {
                ERC721Ticket tkn = (ERC721Ticket) token;
                String tokenName = tkn.getTokenName(assetDefinition, 0);
                name.setText(tokenName);
                setupIcon(token);
            } else {
                name.setText(token.tokenInfo.name);
                setupIcon(token);
            }*/

            clickLayer.setOnClickListener(v -> {
                if (onTokenClickListener != null) {
                    onTokenClickListener.onTokenClick(v, token, null, true);
                }
            });
        }
    }

    public void setOnTokenClickListener(OnTokenClickListener onTokenClickListener) {
        this.onTokenClickListener = onTokenClickListener;
    }
}