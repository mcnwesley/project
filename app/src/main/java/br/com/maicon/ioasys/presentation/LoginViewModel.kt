package br.com.maicon.ioasys.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LifecycleObserver
import br.com.maicon.ioasys.R
import br.com.maicon.ioasys.data.interactor.LoginInteractor
import br.com.maicon.ioasys.data.model.LoginModel
import br.com.maicon.ioasys.data.repository.LoginRepository
import br.com.maicon.ioasys.data.utils.Result
import br.com.maicon.ioasys.utils.extensions.*
import org.koin.core.KoinComponent

class LoginViewModel(application: Application, private val loginRepository: LoginRepository) : AndroidViewModel(application), LifecycleObserver,
    KoinComponent {

    private val loginInteractor: LoginInteractor by getInteractor()

    private val loginState by viewState<Unit>()
    private val mailState by viewState<Unit>()
    private val passwordState by viewState<Unit>()

    fun getLoginState() = loginState.asLiveData()
    fun getMailState() = mailState.asLiveData()
    fun getPasswordState() = passwordState.asLiveData()

    fun onLogin(email: String, password: String) {
        if (validateForm(email, password)) {
            loginState.postLoading()
            loginInteractor.signIn(email, password) {
                when(it){
                    is Result.Success->{
                        loginState.postSuccess(Unit)
                    }
                    is Result.Error->{
                        loginState.postError("Credenciais informadas são inválidas, tente novamente.")
                    }
                    is Result.NetworkError->{
                        loginState.postError("Sem conexão")
                    }
                }
            }
        }
    }

    private fun validateForm(mail: String, password: String): Boolean {
        when {
            mail.isEmpty() -> {
                mailState.postError(getString(R.string.emptyFieldError))
                return false
            }

            mail.isNotMail() -> {
                mailState.postError(getString(R.string.invalidMail))
                return false
            }
        }

        if (password.isEmpty()) {
            passwordState.postError(getString(R.string.emptyFieldError))
            return false
        }
        return true
    }
}