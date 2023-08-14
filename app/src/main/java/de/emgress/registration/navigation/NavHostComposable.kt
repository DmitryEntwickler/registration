package de.emgress.registration.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import de.emgress.registration.R
import de.emgress.registration.commonComposables.TopAppBarComposable
import de.emgress.registration.screens.registrationScreen.RegistrationScreenComposable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavHostComposable(){

    val mNavController = rememberNavController()

    Scaffold(
        topBar = { TopAppBarComposable()}
    ) { innerPaddingValues ->
        NavHost(
            navController = mNavController,
            startDestination = "registrationScreen",
            modifier = Modifier.padding(innerPaddingValues)
        ){
            composable("registrationScreen") { RegistrationScreenComposable() }
            /*
            composable(
                route = "productDetailScreen/{id}",
                arguments = listOf(navArgument("id") { type = NavType.IntType })
            ) { ProductDetailComposable() }

             */
        }
    }
}