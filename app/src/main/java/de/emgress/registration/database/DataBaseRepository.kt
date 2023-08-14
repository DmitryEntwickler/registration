package de.emgress.registration.database

import androidx.lifecycle.LiveData
import de.emgress.registration.Main
import de.emgress.registration.database.tables.UserEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DataBaseRepository {
    suspend fun saveNewUser(user: UserEntity) {
        withContext(Dispatchers.IO) {
            Main.INSTANCE.mDB.userDao().insert(user)
        }
    }
    fun getAllLive(): LiveData<List<UserEntity>> {
        return Main.INSTANCE.mDB.userDao().getAllLive()
    }
}