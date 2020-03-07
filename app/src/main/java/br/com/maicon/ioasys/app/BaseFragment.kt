package br.com.maicon.ioasys.app

import androidx.fragment.app.Fragment
import br.com.maicon.ioasys.utils.view_state.ViewStateListener

open class BaseFragment : Fragment(), ViewStateListener {
    override fun onStateError(error: Throwable) {
    }

    override fun onStateLoading() {
    }
}