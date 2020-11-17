package com.eugens.example.nasadata.data

import com.google.gson.annotations.SerializedName

data class Nasa(

   val nasaData: NasaData
)
data class NasaData (

    @SerializedName("title")val title: String,
    @SerializedName("explanation") val  explanation: String,
    @SerializedName("url") val url: String
)
