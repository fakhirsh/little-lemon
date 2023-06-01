package com.example.littlelemon

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val sharedPreferences = getSharedPreferences("AppPreferences", Context.MODE_PRIVATE)
                    var loginStatusPref = sharedPreferences.getBoolean("LoginStatus", false)
                    val loginStatus by remember { mutableStateOf(loginStatusPref) }

                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Home.route ){
                        composable(Home.route){
                            Home(navController = navController)
                        }
                        composable(OnBoarding.route){
                            OnBoarding(navController = navController)
                        }
                        composable(Profile.route){
                            Profile(navController = navController)
                        }
                    }


                    if (loginStatus) {
                        navController.navigate(Home.route)
                    }
                    else {
                        navController.navigate(OnBoarding.route)
                    }
                }
            }
        }
    }
}