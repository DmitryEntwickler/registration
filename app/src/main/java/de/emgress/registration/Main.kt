package de.emgress.registration

import android.app.Application
import de.emgress.registration.database.DataBaseRepository
import de.emgress.registration.database.DataBase

class Main: Application() {

    val mDB by lazy { DataBase.initDB(this)}
    val mDataBaseRepository by lazy { DataBaseRepository() }

    companion object {
        lateinit var INSTANCE: Main
    }
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}