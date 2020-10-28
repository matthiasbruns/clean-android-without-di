package com.matthiasbruns.cleanandroidwithoutdi.api.character

import androidx.lifecycle.LiveData
import retrofit2.http.GET

interface CharacterService {
    @GET("users/{login}")
    fun getCharacters(): LiveData<ApiResponse<User>>

}