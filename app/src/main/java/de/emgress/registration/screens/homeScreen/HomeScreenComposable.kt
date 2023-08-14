package de.emgress.registration.screens.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import de.emgress.registration.R

@Composable
fun HomeScreenComposable(){

    Column() {
        Text(text = stringResource(id = R.string.welcome))
    }
}