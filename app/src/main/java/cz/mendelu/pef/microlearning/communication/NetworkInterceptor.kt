package cz.mendelu.pef.microlearning.communication

import android.content.Context
import android.net.ConnectivityManager
import cz.mendelu.pef.microlearning.MainApplication

class NetworkInterceptor {
    companion object {
        fun isNetworkConnected(): Boolean {
//            println("fce Network Connected")
            val cm =
                MainApplication.appContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetwork = cm.activeNetworkInfo
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting
        }
    }
}