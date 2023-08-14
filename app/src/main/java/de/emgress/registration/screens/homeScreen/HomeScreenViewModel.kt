package de.emgress.registration.screens.homeScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class HomeScreenViewModel: ViewModel() {

    val mKrimiRepository = KrimiRepository()

    val mListOfKrimiAuthorDTO = mKrimiRepository.mListOfKrimiAuthorsDTO

    init {
        viewModelScope.launch() {
            mKrimiRepository.fetchAllKrimiAuthors()
        }
    }

}