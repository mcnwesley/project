package br.com.maicon.ioasys.data.service

import br.com.maicon.ioasys.data.model.LoginModel
import br.com.maicon.ioasys.data.model.SignInResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface Service {
    @POST(SIGN_IN_PATH)
    suspend fun signIn(@Body loginModel: LoginModel): Response<SignInResponse>
}


const val SIGN_IN_PATH = "users/auth/sign_in"