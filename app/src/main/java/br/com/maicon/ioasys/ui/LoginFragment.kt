package br.com.maicon.ioasys.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.maicon.ioasys.R
import br.com.maicon.ioasys.app.BaseFragment
import br.com.maicon.ioasys.data.model.LoginModel
import br.com.maicon.ioasys.presentation.LoginViewModel
import kotlinx.android.synthetic.main.fragment_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class LoginFragment : BaseFragment() {

    private val viewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        observeEvents()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonEnter.setOnClickListener {
            viewModel.onLogin(
                LoginModel(
                    editTextEmail.text.toString(),
                    editTextPassword.text.toString()
                )
            )
        }
    }

    private fun observeEvents() {
        viewModel.getLoginState().onPostValue(this,
            onSuccess = {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment())
            },
            onError = {
                textViewError.visibility = View.VISIBLE
                textViewError.text = it.message
            })
        viewModel.getMailState().onPostValue(this,
            onSuccess = {
                textInputEmail.error = null
            },
            onError = {
                textInputEmail.error = it.message
            })
        viewModel.getPasswordState().onPostValue(this,
            onSuccess = {
                textInputPassword.error = null
            },
            onError = {
                textInputPassword.error = it.message
            })
    }
}