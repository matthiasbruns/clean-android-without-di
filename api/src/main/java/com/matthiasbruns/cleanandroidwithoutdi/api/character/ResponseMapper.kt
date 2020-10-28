package com.matthiasbruns.cleanandroidwithoutdi.api.character

import com.matthiasbruns.cleanandroidwithoutdi.api.character.model.CharacterResponse
import com.matthiasbruns.cleanandroidwithoutdi.entities.Character

fun mapCharacterResponse(response: CharacterResponse): Character? {
    return Character(
        name = response.name ?: return null
    )
}
