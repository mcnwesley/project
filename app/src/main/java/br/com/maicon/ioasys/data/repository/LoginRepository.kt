package br.com.maicon.ioasys.data.repository

import android.accounts.NetworkErrorException
import br.com.maicon.ioasys.data.model.CustomHeadersModel
import br.com.maicon.ioasys.data.model.LoginModel
import br.com.maicon.ioasys.data.service.ServiceFactory
import br.com.maicon.ioasys.data.utils.ConnectivityHelper
import br.com.maicon.ioasys.data.utils.Result

class LoginRepository(
    private val serviceFactory: ServiceFactory,
    private val connectivityHelper: ConnectivityHelper
) {

    suspend fun signIn(mail: String, password: String): Result<CustomHeadersModel> {
        if (connectivityHelper.checkConnectivity()) {
            return Result.NetworkError(NetworkErrorException())
        } else {
            val customHeadersModel = CustomHeadersModel()
            return try {
                val response = serviceFactory.createClient().signIn(LoginModel(mail, password))
                customHeadersModel.accessToken = response.headers().get("access-token").toString()
                customHeadersModel.client = response.headers().get("client").toString()
                customHeadersModel.uid = response.headers().get("uid").toString()

                if (response.code() == 200) {
                    Result.Success(customHeadersModel)
                } else {
                    Result.Error(Exception("Error"))
                }

            } catch (e: Exception) {
                Result.Error(e)

            }
        }

    }
}