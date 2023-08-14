package de.emgress.registration.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import de.emgress.registration.database.daos.UserDAO
import de.emgress.registration.database.tables.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class DataBase : RoomDatabase() {
    abstract fun userDao(): UserDAO
    companion object{
        fun initDB(context: Context): DataBase{
            val db = Room.databaseBuilder(
                context,
                DataBase::class.java,
                "registration-database"
            ).build()
            return db
        }
    }
}