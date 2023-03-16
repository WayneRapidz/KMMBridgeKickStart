package io.rapidz.kmmbridgekickstart

import io.rapidz.kmmbridgekickstart.repository.BreedRepository

data class SDKHandle(
    val breedRepository: BreedRepository,
    val appAnalytics: AppAnalytics,
    val breedAnalytics: BreedAnalytics
)