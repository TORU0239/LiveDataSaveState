package sg.toru.livedatasavestate.app

import android.app.Application
import android.content.Context

class App: Application() {

    private lateinit var appContext: Context

    override fun onCreate() {
        super.onCreate()
        appContext = this
    }
}