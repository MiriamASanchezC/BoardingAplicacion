package com.example.boardingapp.onBoardViews

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.boardingapp.dataStore.StoreBoarding


@Composable
fun NavManager() {
    val context = LocalContext.current
    val dataStore = StoreBoarding(context)
    val store = dataStore.getStoreBoarding.collectAsState(initial = false)

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = if (store.value == true) "home" else "onBoarding") {
        composable(route = "onBoarding") {
            MainOnBoarding(navController, dataStore)
        }
        composable(route = "home") {
            HomeView(navController)
        }
    }
}
