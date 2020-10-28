package com.matthiasbruns.cleanandroidwithoutdi.api.character.model

data class CharacterResponse(
    val name: String?,
    val house: String?,
    val patronus: String?,
    val species: String?,
    val bloodStatus: String?,
    val role: String?,
    val school: String?,
    val deathEater: Boolean?,
    val dumbledoresArmy: Boolean?,
    val orderOfThePhoenix: Boolean?,
    val ministryOfMagic: Boolean?,
    val alias: String?,
    val wand: String?,
    val boggart: String?,
    val animagus: String?
)
