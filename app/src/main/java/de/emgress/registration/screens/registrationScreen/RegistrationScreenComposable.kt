package de.emgress.registration.screens.registrationScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RegistrationScreen(mRegistrationScreenViewModel: RegistrationScreenViewModel = viewModel()) {

    Column {
        Text("Reg")
    }
}