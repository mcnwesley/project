package br.com.maicon.ioasys.data.utils

sealed class Result <out T>{
    class Success<T>(val data : T): Result<T>()
    class Error(val exception: Throwable): Result<Nothing>()
    class NetworkError(val exception: Throwable) : Result<Nothing>()
}