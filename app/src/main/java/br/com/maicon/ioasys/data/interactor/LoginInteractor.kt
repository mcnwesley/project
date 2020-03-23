package br.com.maicon.ioasys.data.interactor

import br.com.maicon.ioasys.data.model.CustomHeadersModel
import br.com.maicon.ioasys.data.model.SignInResponse
import br.com.maicon.ioasys.data.repository.LoginRepository
import br.com.maicon.ioasys.data.utils.Result
import br.com.maicon.ioasys.utils.ThreadContextProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginInteractor(
    private val contextProvider: ThreadContextProvider,
    private val loginRepository: LoginRepository,
    private val scope: CoroutineScope
) {

    fun signIn(mail: String, password: String, result: (Result<CustomHeadersModel>) -> Unit) {
        scope.launch(contextProvider.io) {
            val response = loginRepository.signIn(mail, password)
            withContext(contextProvider.main) {
                result(response)
            }
        }
    }

}