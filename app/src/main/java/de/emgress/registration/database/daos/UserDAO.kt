package de.emgress.registration.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import de.emgress.registration.database.tables.UserEntity

@Dao
interface UserDao {
    @Query("SELECT * FROM user_table")
    fun getAllLive(): LiveData<List<UserEntity>>

    @Insert
    fun insert(user: UserEntity)
}