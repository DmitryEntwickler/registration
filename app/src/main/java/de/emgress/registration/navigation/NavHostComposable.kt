package de.emgress.registration.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import de.emgress.registration.R
import de.emgress.registration.commonComposables.TopAppBarComposable
import de.emgress.registration.screens.homeScreen.HomeScreenComposable
import de.emgress.registration.screens.myDataScreen.MyDataScreenComposable
import de.emgress.registration.screens.registrationScreen.RegistrationScreenComposable
import de.emgress.registration.screens.startScreen.StartScreenComposable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavHostComposable(){

    val mNavController = rememberNavController()
    val mIsTopAppBarVisible = remember { mutableStateOf(true) }
    val mIsBottomNavigationVisible = remember { mutableStateOf(true) }

    Scaffold(
        topBar = { if (mIsTopAppBarVisible.value) TopAppBarComposable() },
        bottomBar = { if (mIsBottomNavigationVisible.value) BottomNavigationComposable(mNavController = mNavController)}
    ) { innerPaddingValues ->
        NavHost(
            navController = mNavController,
            startDestination = "startScreen",
            modifier = Modifier.padding(innerPaddingValues)
        ){
            composable("startScreen") {
                mIsTopAppBarVisible.value = false
                mIsBottomNavigationVisible.value = false
                StartScreenComposable(mNavController = mNavController)
            }
            composable("homeScreen") {
                mIsTopAppBarVisible.value = false
                mIsBottomNavigationVisible.value = true
                HomeScreenComposable()
            }
            composable("myDataScreen") {
                mIsTopAppBarVisible.value = false
                mIsBottomNavigationVisible.value = true
                MyDataScreenComposable()
            }
            composable("registrationScreen") {
                mIsTopAppBarVisible.value = true
                mIsBottomNavigationVisible.value = false
                RegistrationScreenComposable(mNavController = mNavController)
            }

        }
    }
}