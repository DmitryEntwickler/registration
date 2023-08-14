package de.emgress.registration.screens.startScreen

import androidx.lifecycle.ViewModel
import de.emgress.registration.database.DataBaseRepository

class StartScreenViewModel: ViewModel() {

    val mDataBaseRepository = DataBaseRepository()
    val mListOfUsers = mDataBaseRepository.getAllLive()

}