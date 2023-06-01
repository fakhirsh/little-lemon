package com.example.littlelemon

import android.widget.EditText
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.Primary1

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
                .background(Color(0xFF495E57)),
            contentAlignment = Alignment.Center

        ){
            Text(
                text = "Let's get to know you",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 24.sp
                ),
            )
        }
        
    }

}


@Composable
fun Form(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "Personal information",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(top = 30.dp, bottom = 40.dp)

        )
        MyInputField("First Name")
        MyInputField("Last Name")
        MyInputField("Email")
        //Spacer(modifier = Modifier.fillMaxSize())
        Button(
            modifier = Modifier
                .padding(bottom = 20.dp, top = 70.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFF4CE14)),
            onClick = {
                /*TODO*/
                })
        {
            Text(
                text="Register",
                color = Color.Black,
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyInputField(label:String){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 10.dp)
    ){
        OutlinedTextField(
            value = "",
            isError = false,
            label = {
                Text(text = label)
            },

            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
    }

}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun OnBoardingPreview(){
    OnBoarding()
}