package de.emgress.registration.screens.homeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import de.emgress.registration.commonComposables.AuthorItem

@Composable
fun HomeScreenComposable(mHomeScreenViewModel: HomeScreenViewModel = viewModel()){

    val mListOfKrimiAuthorDTO by mHomeScreenViewModel.mListOfKrimiAuthorDTO.observeAsState()

    if (mListOfKrimiAuthorDTO == null) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProgressIndicator(
                modifier = Modifier.size(96.dp),
                color = MaterialTheme.colorScheme.primary,
                strokeWidth = 16.dp
            )
        }
    }
    else {
        Column() {
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ) {
                Column(modifier = Modifier
                    .padding(8.dp)) {
                    Text(text = "DB: -903, Tabelle: krimi_autors")
                    Text(text = "Einträge: ${mListOfKrimiAuthorDTO?.size}")
                }
            }
            LazyColumn(){
                items(
                    items = mListOfKrimiAuthorDTO.orEmpty(),
                    key = { autor -> autor.id }
                ){listItem ->
                    AuthorItem(autor = listItem)
                    Divider()
                }
            }
        }
    }
}