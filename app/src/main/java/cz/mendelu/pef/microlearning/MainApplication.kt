package cz.mendelu.pef.microlearning

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

// todo model Question
// todo model Option

// todo ngrok -- odstranit upozrnovaci stranku -- pomoci v cmd: ngrok http 8090 --request-header-add "ngrok-skip-browser-warning: 1"
//To remove this page:
//Set and send an ngrok-skip-browser-warning request header with any value.
//Or, set and send a custom/non-standard browser User-Agent request header.
//Or, please upgrade to any paid ngrok account.

// todo html componenta pro zobrazovani lessons, zeptat se nekoho ze SpatialHubu

@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {
        lateinit var appContext: Context
            private set
    }

}