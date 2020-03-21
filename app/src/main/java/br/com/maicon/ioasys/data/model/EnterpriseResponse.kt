package br.com.maicon.ioasys.data.model

import com.google.gson.annotations.SerializedName

data class EnterpriseResponse (

    @SerializedName("enterprises")
    val enterprises: List<EnterpriseModel>?

)