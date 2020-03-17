package br.com.maicon.ioasys.data.repository

import br.com.maicon.ioasys.data.model.LoginModel
import br.com.maicon.ioasys.data.model.SignInResponse
import br.com.maicon.ioasys.data.service.Service

class LoginRepository(private val service: Service) {

    suspend fun signIn(mail: String, password: String): SignInResponse {

        return service.signIn(LoginModel(mail, password))
    }
}