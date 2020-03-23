package br.com.maicon.ioasys.data.model

import com.google.gson.annotations.SerializedName

data class EnterpriseTypeModel (

    @SerializedName("id")
    val id: Int?,

    @SerializedName("enterprise_type_name")
    val enterprise_type_name: String?
)