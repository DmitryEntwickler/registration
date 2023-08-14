package de.emgress.registration

import android.app.Application
import de.emgress.registration.database.DBRepository
import de.emgress.registration.database.DataBase

class Main: Application() {

    val mDB by lazy { DataBase.initDB(this)}
    val mDBRepository by lazy { DBRepository() }

    companion object {
        lateinit var INSTANCE: Main
    }
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}