package br.com.maicon.ioasys.data.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServiceFactory(private val url: String) {
    fun createClient() : Service{
        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(Service::class.java)
    }


}