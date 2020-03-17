package br.com.maicon.ioasys.di

import br.com.maicon.ioasys.data.repository.LoginRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory { LoginRepository(get()) }
}