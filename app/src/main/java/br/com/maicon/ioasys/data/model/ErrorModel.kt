package br.com.maicon.ioasys.data.model

import com.google.gson.annotations.SerializedName

data class ErrorModel(
    @SerializedName("messages")
    val messages: List<String>
)