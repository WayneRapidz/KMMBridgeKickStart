package io.rapidz.kmmbridgekickstart

data class SDKHandle(
    val breedRepository: CallbackBreedRepository,
    val appAnalytics: AppAnalytics,
    val breedAnalytics: BreedAnalytics
)