package br.com.maicon.ioasys.utils.extensions

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import br.com.maicon.ioasys.utils.EventLiveData
import br.com.maicon.ioasys.utils.view_state.ViewState

fun <T> viewState(): Lazy<EventLiveData<ViewState<T>>> {
    return lazy {
        EventLiveData<ViewState<T>>()
    }
}

fun AndroidViewModel.getString(resId: Int): String = getApplication<Application>().getString(resId)

//inline fun <V, reified U> V.useCase() where U : UseCase<*, *>, V : ViewModel, V : KoinComponent = inject<U> {
//    parametersOf(viewModelScope)
//}