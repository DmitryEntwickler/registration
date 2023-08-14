package de.emgress.registration.screens.registrationScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import de.emgress.registration.R

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun RegistrationScreenComposable(
    mRegistrationScreenViewModel: RegistrationScreenViewModel = viewModel(),
    mNavController: NavController
) {

    val mKeyboardController = LocalSoftwareKeyboardController.current
    val mScrollState = rememberScrollState()

    val mName by mRegistrationScreenViewModel.mName.observeAsState()
    val mSurname by mRegistrationScreenViewModel.mSurname.observeAsState()
    val mAdress by mRegistrationScreenViewModel.mAdress.observeAsState()
    val mCity by mRegistrationScreenViewModel.mCity.observeAsState()
    val mEmail by mRegistrationScreenViewModel.mEmail.observeAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(mScrollState),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {

        mName?.let {
            OutlinedTextField(
                value = it,
                onValueChange = {mRegistrationScreenViewModel.mName.value = it },
                label = { Text(text = stringResource(id = R.string.name)) },
                singleLine = true,
                keyboardActions = KeyboardActions(onDone = { mKeyboardController?.hide() }),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    autoCorrect = false
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 16.dp),
            )
        }
        mSurname?.let {
            OutlinedTextField(
                value = it,
                onValueChange = {mRegistrationScreenViewModel.mSurname.value = it },
                label = { Text(text = stringResource(id = R.string.surname)) },
                singleLine = true,
                keyboardActions = KeyboardActions(onDone = { mKeyboardController?.hide() }),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    autoCorrect = false
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 16.dp),
            )
        }
        mAdress?.let {
            OutlinedTextField(
                value = it,
                onValueChange = {mRegistrationScreenViewModel.mAdress.value = it },
                label = { Text(text = stringResource(id = R.string.adress)) },
                singleLine = true,
                keyboardActions = KeyboardActions(onDone = { mKeyboardController?.hide() }),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    autoCorrect = false
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 16.dp),
            )
        }
        mCity?.let {
            OutlinedTextField(
                value = it,
                onValueChange = {mRegistrationScreenViewModel.mCity.value = it },
                label = { Text(text = stringResource(id = R.string.city)) },
                singleLine = true,
                keyboardActions = KeyboardActions(onDone = { mKeyboardController?.hide() }),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    autoCorrect = false
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 16.dp),
            )
        }
        mEmail?.let {
            OutlinedTextField(
                value = it,
                onValueChange = {mRegistrationScreenViewModel.mEmail.value = it },
                label = { Text(text = stringResource(id = R.string.email)) },
                singleLine = true,
                keyboardActions = KeyboardActions(onDone = { mKeyboardController?.hide() }),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    autoCorrect = false
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 16.dp),
            )
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 24.dp),
            onClick = {
                mRegistrationScreenViewModel.isFormularReady()
            }
        ) {
            Row(horizontalArrangement = Arrangement.Center) {
                Image(imageVector = Icons.Default.Person, contentDescription = "")
                Text(
                    text = stringResource(id = R.string.registrate),
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
    }


}