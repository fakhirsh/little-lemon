package com.example.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController){

    Column() {
        Text(text = "Home")
        Button(
            onClick = {
                navController.navigate(Profile.route)
            }) {
                Text(text = "Profile")
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    Home(navController = NavController(LocalContext.current))
}