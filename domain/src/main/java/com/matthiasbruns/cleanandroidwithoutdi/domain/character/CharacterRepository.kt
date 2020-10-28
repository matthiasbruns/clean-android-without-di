package com.matthiasbruns.cleanandroidwithoutdi.domain.character

import com.matthiasbruns.cleanandroidwithoutdi.entities.Character

lateinit var remoteGetCharacters: suspend () -> List<Character>

suspend fun getCharacters(): List<Character> = remoteGetCharacters()
