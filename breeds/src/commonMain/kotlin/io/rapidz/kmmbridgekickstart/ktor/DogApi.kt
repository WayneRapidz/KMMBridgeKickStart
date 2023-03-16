package io.rapidz.kmmbridgekickstart.ktor

import io.rapidz.kmmbridgekickstart.response.BreedResult

internal interface DogApi {
    suspend fun getJsonFromApi(): BreedResult
}
