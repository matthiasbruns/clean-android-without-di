package com.matthiasbruns.cleanandroidwithoutdi.api.character

import com.matthiasbruns.cleanandroidwithoutdi.api.character.model.CharacterResponse
import com.matthiasbruns.cleanandroidwithoutdi.api.httpClient
import com.matthiasbruns.cleanandroidwithoutdi.api.withEndpoint
import io.ktor.client.request.*
import io.ktor.util.*

@KtorExperimentalAPI
suspend fun fetchCharacters(): List<CharacterResponse> {
    val requestUrl = "characters".withEndpoint
    return httpClient.get(requestUrl)
}
