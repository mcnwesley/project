package br.com.maicon.ioasys.di

import br.com.maicon.ioasys.data.utils.ConnectivityHelper
import br.com.maicon.ioasys.utils.ThreadContextProvider
import org.koin.dsl.module

val generalModule = module {
    single { ConnectivityHelper(get()) }
    factory { ThreadContextProvider() }
}
