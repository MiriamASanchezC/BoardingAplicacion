package com.example.boardingapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.boardingapp.R

@Composable
fun SplashScreen(navController: NavController){
    LaunchedEffect(key1 = true) {
        delay(200)
        navController.navigate("onBoarding"){
            popUpTo(0)
        }

    }
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.gatito),
            contentDescription = "Logo")
    }
}