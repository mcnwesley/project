package br.com.maicon.ioasys.di

import br.com.maicon.ioasys.data.interactor.LoginInteractor
import br.com.maicon.ioasys.utils.ThreadContextProvider
import kotlinx.coroutines.CoroutineScope
import org.koin.dsl.module

val interactorModule = module {
    factory { (scope: CoroutineScope) ->LoginInteractor(get(), get(), scope) }
}