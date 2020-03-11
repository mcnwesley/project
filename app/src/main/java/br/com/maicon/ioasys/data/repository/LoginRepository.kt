package br.com.maicon.ioasys.data.repository

import br.com.maicon.ioasys.app.BaseRepository
import br.com.maicon.ioasys.data.Response
import br.com.maicon.ioasys.data.model.LoginModel
import br.com.maicon.ioasys.data.model.SignInResponse
import br.com.maicon.ioasys.utils.extensions.safeApiCall

class LoginRepository : BaseRepository() {

    suspend fun signIn(mail: String, password: String): Response<SignInResponse> {
        return safeApiCall(
            { networkStatus.isOnline() },
            { service.signIn(LoginModel(mail, password)) })

    }
}