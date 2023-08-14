package de.emgress.registration.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationComposable(mNavController: NavController) {

    val mActualRoute = mNavController.currentBackStackEntryAsState().value?.destination?.route

    BottomAppBar() {
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.Home,"") },
            label = { Text(text = "Home") },
            selected = (mActualRoute == "homeScreen"),
            onClick = { mNavController.navigate("homeScreen") }
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.Person,"") },
            label = { Text(text = "Konto") },
            selected = (mActualRoute == "myDataScreen"),
            onClick = { mNavController.navigate("myDataScreen") }
        )

    }
}