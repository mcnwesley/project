package br.com.maicon.ioasys.app

import android.app.Application
import br.com.maicon.ioasys.di.presentationModule
import br.com.maicon.ioasys.di.serviceModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    presentationModule,
                    serviceModule
                )
            ).androidContext(applicationContext)
        }
    }
}