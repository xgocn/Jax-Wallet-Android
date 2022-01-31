package com.jaxwallet.app.walletconnect.util

import com.jaxwallet.token.tools.Numeric

fun ByteArray.toHexString(): String {
    return Numeric.toHexString(this, 0, this.size, false)
}

fun String.toByteArray(): ByteArray {
    return Numeric.hexStringToByteArray(this)
}