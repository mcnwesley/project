package br.com.maicon.ioasys.data

import com.google.gson.annotations.SerializedName

data class SignInResponse(
    @SerializedName("investor")
    val investor: String = "",
    @SerializedName("enterprise")
    val enterprise: String = "",
    @SerializedName("success")
    val success: Boolean = false,
    @SerializedName("errors")
    val errors: String = ""
)