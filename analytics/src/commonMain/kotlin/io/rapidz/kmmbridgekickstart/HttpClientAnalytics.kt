package io.rapidz.kmmbridgekickstart

class HttpClientAnalytics internal constructor() {
    
    fun logMessage(message: String) {
        sendEvent("httpClientMessage", "message" to message)
    }
}