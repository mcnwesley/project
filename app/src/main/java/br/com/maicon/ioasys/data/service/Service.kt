package br.com.maicon.ioasys.data.service

import br.com.maicon.ioasys.data.LoginModel
import br.com.maicon.ioasys.data.SignInResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface Service {
    @POST(SIGN_IN_PATH)
    suspend fun signIn(@Body loginModel: LoginModel): SignInResponse
}


const val SIGN_IN_PATH = "users/auth/sign_in"