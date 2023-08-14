package de.emgress.registration.screens.myDataScreen

import androidx.lifecycle.ViewModel
import de.emgress.registration.database.DataBaseRepository

class MyDataScreenViewModel: ViewModel() {

    val mDataBaseDBRepository = DataBaseRepository()
    val mListOfUsers = mDataBaseDBRepository.getAllLive()
}