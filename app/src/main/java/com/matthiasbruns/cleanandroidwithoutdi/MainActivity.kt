package com.matthiasbruns.cleanandroidwithoutdi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.matthiasbruns.cleanandroidwithoutdi.api.Api

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Api.inject()
    }
}
