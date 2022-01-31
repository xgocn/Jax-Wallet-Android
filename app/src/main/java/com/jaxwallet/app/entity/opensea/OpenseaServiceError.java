package com.jaxwallet.app.entity.opensea;

import com.jaxwallet.app.entity.ErrorEnvelope;

/**
 * Created by James on 20/12/2018.
 * AJ TECHNOLOGIES LTD
 */

public class OpenseaServiceError extends Exception {
    public final ErrorEnvelope error;

    public OpenseaServiceError(String message) {
        super(message);

        error = new ErrorEnvelope(message);
    }
}
