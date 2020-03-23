package br.com.maicon.ioasys.data.model

import com.google.gson.annotations.SerializedName

data class InvestorModel(

    @SerializedName("id")
    val id: Int?,

    @SerializedName("investorName")
    val investorName: String?,

    @SerializedName("email")
    val mail: String?,

    @SerializedName("city")
    val city: String?,

    @SerializedName("country")
    val country: String?,

    @SerializedName("balance")
    val balance: Double?,

    @SerializedName("photo")
    val photo: String?,

    @SerializedName("portfolio")
    val portfolio: PortfolioModel?,

    @SerializedName("portfolioValue")
    val portfolioValue: Double?,

    @SerializedName("firstAccess")
    val firstAccess: Boolean?,

    @SerializedName("superAngel")
    val superAngel: Boolean?

)



