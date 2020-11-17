package com.eugens.example.nasadata.data

import retrofit2.Call
import retrofit2.http.GET

interface NasaApi {

    @GET
        ("/planetary/apod?api_key=v9cvJpaAHbKaGmaA2oPtcGg7CN1PjFnWZm9NX3aq")
    fun getData(): Call<NasaData>

}

