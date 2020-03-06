package br.com.maicon.ioasys.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LifecycleObserver
import br.com.maicon.ioasys.R
import br.com.maicon.ioasys.utils.extensions.*
import org.koin.core.KoinComponent

class LoginViewModel(application: Application) : AndroidViewModel(application), LifecycleObserver,
    KoinComponent {

    private val loginState by viewState<Unit>()
    private val mailState by viewState<Unit>()
    private val passwordState by viewState<Unit>()

    fun getLoginState() = loginState.asLiveData()
    fun getMailState() = mailState.asLiveData()
    fun getPasswordState() = passwordState.asLiveData()

    fun onLogin(mail: String, password: String) {
        if (validateForm(mail, password)) {
            loginState.postSuccess(Unit)
        }else{
            loginState.postError("ERRROR")
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