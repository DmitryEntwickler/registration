package de.emgress.registration.screens.myDataScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.lifecycle.viewmodel.compose.viewModel
import de.emgress.registration.R
import de.emgress.registration.commonComposables.UserInfoComposable

@Composable
fun MyDataScreenComposable(mMyDataScreenViewModel: MyDataScreenViewModel = viewModel()) {

    val mListOfUsers by mMyDataScreenViewModel.mListOfUsers.observeAsState()

    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = stringResource(id = R.string.kontotTitle),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        LazyColumn(){
            items(
                items = mListOfUsers.orEmpty(),
                key = { user -> user.mId }
            ){listItem ->
                UserInfoComposable(user = listItem)
                Divider()
            }
        }

    }

}