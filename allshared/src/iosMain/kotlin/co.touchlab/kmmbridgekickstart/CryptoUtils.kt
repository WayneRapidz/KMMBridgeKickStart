package co.touchlab.kmmbridgekickstart

import co.touchlab.kmmbridgekickstart.Constants.MIN_LENGTH_CRYPTO_ADDRESS

object CryptoAddressFactory {
    fun createCryptoAddressValidator() = CryptoAddressValidator
}

object CryptoAddressValidator{
    fun isCryptoAddressValid(cryptoAddress: String): Boolean{
        return !cryptoAddress.isNullOrEmpty() && cryptoAddress.length > MIN_LENGTH_CRYPTO_ADDRESS
    }
}