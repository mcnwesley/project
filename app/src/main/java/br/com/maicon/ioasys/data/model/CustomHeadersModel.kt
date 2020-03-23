package br.com.maicon.ioasys.data.model

import com.google.gson.annotations.SerializedName

data class CustomHeadersModel(

    @SerializedName("accessToken")
    var accessToken: String = "",
    @SerializedName("client")
    var client: String = "",
    @SerializedName("uid")
    var uid: String = ""
)
