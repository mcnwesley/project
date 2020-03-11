package br.com.maicon.ioasys.app

import br.com.maicon.ioasys.data.service.NetworkStatus
import br.com.maicon.ioasys.data.service.Service
import org.koin.core.KoinComponent
import org.koin.core.inject


open class BaseRepository : KoinComponent {

    protected val networkStatus: NetworkStatus by inject()
    protected val service: Service by inject()

}
