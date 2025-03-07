package com.edisas.rdi.network

import com.edisas.rdi.config.ApiConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://prawn-cunning-koala.ngrok-free.app/") // Base URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}
