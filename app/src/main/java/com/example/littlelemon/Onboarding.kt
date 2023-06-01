package com.example.littlelemon

import android.widget.EditText
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OnBoarding(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header()
        Form()
    }
}

@Composable
fun Header(){

    Column {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 20.dp)
                .height(60.dp),
            painter = painterResource(id = R.drawable.logo) ,
            contentDescription = "Little Lemon Logo")
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color(0xFF495E57))

        ){
            Text(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.Center),
                text = "Let's get to know you",
                color = Color.White,
                textAlign = TextAlign.Center,


            )
        }
        
    }

}


@Composable
fun Form(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Personal information"
        )
        MyInputField("First Name")
        MyInputField("Last Name")
        MyInputField("Email Name")
        Button(
            onClick = {
                /*TODO*/
                })
        {
            Text(text="Register")
        }


    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyInputField(label:String){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
    ){
        OutlinedTextField(
            value = "",
            isError = false,
            label = {
                Text(text = label)
            },

            onValueChange = {}
        )
    }

}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun OnBoardingPreview(){
    OnBoarding()
}