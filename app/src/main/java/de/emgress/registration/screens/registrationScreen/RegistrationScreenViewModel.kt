package de.emgress.registration.screens.registrationScreen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegistrationScreenViewModel: ViewModel() {

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
            println("-> not ok")
            return false
        }
        else {
            println("-> ok")
            return true
        }

    }
}