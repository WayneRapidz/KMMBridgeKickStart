package io.rapidz.mobile

import io.rapidz.mobile.Constants.MIN_LENGTH_CRYPTO_ADDRESS

object CryptoAddressFactory {
    fun createCryptoAddressValidator() = CryptoAddressValidator
}

object CryptoAddressValidator{
    fun isCryptoAddressValid(cryptoAddress: String): Boolean{
        return !cryptoAddress.isNullOrEmpty() && cryptoAddress.length > MIN_LENGTH_CRYPTO_ADDRESS
    }
}