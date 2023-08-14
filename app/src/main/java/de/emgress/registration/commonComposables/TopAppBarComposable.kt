package de.emgress.registration.commonComposables

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import de.emgress.registration.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComposable(){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.topAppBarText),
                color = MaterialTheme.colorScheme.onPrimary
            ) },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}