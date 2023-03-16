package io.rapidz.kmmbridgekickstart

import io.rapidz.kmmbridgekickstart.repository.BreedRepository

internal interface ServiceLocator {
    val breedRepository: BreedRepository
    val appAnalytics: AppAnalytics
    val breedAnalytics: BreedAnalytics
    val httpClientAnalytics: HttpClientAnalytics
}
