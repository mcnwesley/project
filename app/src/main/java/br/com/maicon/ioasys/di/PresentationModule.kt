package br.com.maicon.ioasys.di

import br.com.maicon.ioasys.presentation.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { LoginViewModel(get(), get()) }
}


