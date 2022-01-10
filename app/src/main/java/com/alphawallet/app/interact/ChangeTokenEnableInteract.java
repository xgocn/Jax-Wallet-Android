package com.alphawallet.app.interact;

import com.alphawallet.app.repository.TokenRepositoryType;
import com.alphawallet.app.entity.tokens.Token;
import com.alphawallet.app.entity.Wallet;

import io.reactivex.Completable;

public class ChangeTokenEnableInteract {
    private final TokenRepositoryType tokenRepository;

    public ChangeTokenEnableInteract(TokenRepositoryType tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    public Completable setEnable(Wallet wallet, Token token, boolean enabled) {
        tokenRepository.setEnable(wallet, token, enabled);
        tokenRepository.setVisibilityChanged(wallet, token);
        return Completable.fromAction(() -> { });
    }
}
