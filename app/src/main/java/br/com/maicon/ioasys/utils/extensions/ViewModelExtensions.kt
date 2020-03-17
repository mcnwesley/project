package br.com.maicon.ioasys.utils.extensions

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.maicon.ioasys.utils.EventLiveData
import br.com.maicon.ioasys.utils.view_state.ViewState
import org.koin.core.KoinComponent
import org.koin.core.inject
import org.koin.core.parameter.parametersOf

fun <T> viewState(): Lazy<EventLiveData<ViewState<T>>> {
    return lazy {
        EventLiveData<ViewState<T>>()
    }
}

fun AndroidViewModel.getString(resId: Int): String = getApplication<Application>().getString(resId)

inline fun <V, reified U> V.getInteractor() where V : ViewModel, V : KoinComponent = inject<U> {
    parametersOf(viewModelScope)
}