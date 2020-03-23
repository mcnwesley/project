package br.com.maicon.ioasys.data.model

import com.google.gson.annotations.SerializedName

data class PortfolioModel (

    @SerializedName("enterpriseNumber")
    val enterpriseNumber: Int?,

    @SerializedName("enterprise")
    val enterprise: List<String>?

)