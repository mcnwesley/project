package br.com.maicon.ioasys.data.service

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Type

object ServiceFactory {
    fun createClient(url: String) : Service{
        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(Service::class.java)
    }


}