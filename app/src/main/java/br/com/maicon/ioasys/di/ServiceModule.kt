package br.com.maicon.ioasys.di

import br.com.maicon.ioasys.data.service.ServiceFactory
import br.com.maicon.ioasys.utils.BASE_URL
import org.koin.dsl.module


val serviceModule = module {
    single { ServiceFactory.createClient(BASE_URL) }
}
