package de.emgress.registration.screens.homeScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import de.emgress.registration.R
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

            Text(
                text = stringResource(id = R.string.welcome),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(id = R.string.krimiTitle),
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.fillMaxWidth().padding(8.dp),
            )
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