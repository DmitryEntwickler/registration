package de.emgress.registration.screens.registrationScreen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import de.emgress.registration.database.DataBaseRepository
import de.emgress.registration.database.tables.UserEntity
import kotlinx.coroutines.launch

class RegistrationScreenViewModel: ViewModel() {

    val mDataBaseDBRepository = DataBaseRepository()

    val mName = MutableLiveData("")
    val mSurname = MutableLiveData("")
    val mAdress = MutableLiveData("")
    val mCity = MutableLiveData("")
    val mEmail = MutableLiveData("")

    fun isFormularReady(): Boolean {
        if (
            mName.value.isNullOrBlank() ||
            mSurname.value.isNullOrEmpty() ||
            mAdress.value.isNullOrEmpty() ||
            mCity.value.isNullOrEmpty() ||
            mEmail.value.isNullOrEmpty()
        ) {
            return false
        }
        else {
            saveNewUser()
            return true
        }
    }

    private fun saveNewUser() {
        viewModelScope.launch {
            mDataBaseDBRepository.saveNewUser(
                UserEntity(
                    mName = mName.value,
                    mSurname = mSurname.value,
                    mAdress = mAdress.value,
                    mCity = mCity.value,
                    mEmail = mEmail.value
                )
            )
        }
    }
}