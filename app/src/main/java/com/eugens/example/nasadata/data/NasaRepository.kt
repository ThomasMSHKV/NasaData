package com.eugens.example.nasadata.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class NasaRepository: CoroutineScope {
    override val coroutineContext = Dispatchers.IO
    private val nasaApi:NasaApi = Retrofit.Builder()
        .baseUrl("https://api.nasa.gov")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(NasaApi::class.java)


    fun getData() = async {
        nasaApi.getData()
            .execute()
            .body()
    }
}