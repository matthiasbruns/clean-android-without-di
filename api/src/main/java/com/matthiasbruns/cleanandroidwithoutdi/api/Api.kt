package com.matthiasbruns.cleanandroidwithoutdi.api

import com.matthiasbruns.cleanandroidwithoutdi.api.character.fetchCharacters
import com.matthiasbruns.cleanandroidwithoutdi.api.character.mapCharacterResponse
import com.matthiasbruns.cleanandroidwithoutdi.api.character.model.CharacterResponse
import com.matthiasbruns.cleanandroidwithoutdi.domain.character.remoteGetCharacters
import com.matthiasbruns.cleanandroidwithoutdi.entities.Character
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.util.*

internal lateinit var responseMapper: (CharacterResponse) -> Character?

@KtorExperimentalAPI
internal val httpClient by lazy {
    HttpClient(CIO) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(KotlinxSerializer.DefaultJson)
        }
    }
}

internal val String.withEndpoint: String
    get() = "https://www.potterapi.com/v1/$this"

class Api {
    companion object {
        @KtorExperimentalAPI
        fun inject() {
            responseMapper = { mapCharacterResponse(it) }
            remoteGetCharacters = suspend {
                val response = fetchCharacters()
                response.mapNotNull(responseMapper)
            }
        }
    }
}
