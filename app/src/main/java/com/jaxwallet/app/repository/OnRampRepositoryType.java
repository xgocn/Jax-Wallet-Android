package com.jaxwallet.app.repository;

import com.jaxwallet.app.entity.OnRampContract;
import com.jaxwallet.app.entity.tokens.Token;

public interface OnRampRepositoryType {
    String getUri(String address, Token token);

    OnRampContract getContract(Token token);
}
