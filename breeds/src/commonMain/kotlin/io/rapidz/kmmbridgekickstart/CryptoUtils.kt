package io.rapidz.kmmbridgekickstart

import io.rapidz.kmmbridgekickstart.Constants.MIN_LENGTH_CRYPTO_ADDRESS


class CryptoUtils{
    fun isCryptoAddressValid(cryptoAddress: String): Boolean{
        return !cryptoAddress.isNullOrEmpty() && cryptoAddress.length > MIN_LENGTH_CRYPTO_ADDRESS
    }
}