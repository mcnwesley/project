package br.com.maicon.ioasys.data.model

import com.google.gson.annotations.SerializedName

data class SignInResponse(
    @SerializedName("investor")
    val investor: InvestorModel?,

    @SerializedName("enterprise")
    val enterprise: String?,

    @SerializedName("success")
    val success: Boolean?,

    @SerializedName("errors")
    val errors: String?
)