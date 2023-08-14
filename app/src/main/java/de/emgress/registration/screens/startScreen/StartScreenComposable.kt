package de.emgress.registration.screens.startScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import de.emgress.registration.R
import kotlinx.coroutines.delay

@Composable
fun StartScreenComposable(
    mStartScreenViewModel: StartScreenViewModel = viewModel(),
    mNavController: NavController
){

    val mListOfUsers by mStartScreenViewModel.mListOfUsers.observeAsState()

    LaunchedEffect(mListOfUsers) {
        delay(1000)
        if (mListOfUsers.isNullOrEmpty()) {
           mNavController.navigate("registrationScreen")
        }
        else {
           mNavController.navigate("myDataScreen")
        }

    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.welcome),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )
    }
}