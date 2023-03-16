package io.rapidz.kmmbridgekickstart

class AppAnalytics internal constructor() {
    
    fun appStarted() {
        sendEvent("appStarted")
    }
}