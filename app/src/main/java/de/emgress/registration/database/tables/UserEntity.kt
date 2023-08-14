package de.emgress.registration.database.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserEntity (
    @ColumnInfo(name = "name") val mName: String?,
    @ColumnInfo(name = "surname") val mSurname: String?,
    @ColumnInfo(name = "adress") val mAdress: String?,
    @ColumnInfo(name = "city") val mCity: String?,
    @ColumnInfo(name = "email") val mEmail: String?,
) {
    @PrimaryKey(autoGenerate = true) var mId: Long = 0L
}