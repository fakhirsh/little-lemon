package com.example.littlelemon

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Home(){
    Text(text = "Home")
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HomePreview(){
    Home()
}