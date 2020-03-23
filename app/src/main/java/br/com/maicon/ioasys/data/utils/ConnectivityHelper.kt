package br.com.maicon.ioasys.data.utils

import android.content.Context
import android.net.ConnectivityManager

class ConnectivityHelper (private val context: Context) {
    fun checkConnectivity() : Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo == null
    }
}