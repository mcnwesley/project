package br.com.maicon.ioasys.data.model

import com.google.gson.annotations.SerializedName

data class LoginModel(
    @SerializedName("email")
    val mail : String = "",
    @SerializedName("password")
    val password : String = ""
)