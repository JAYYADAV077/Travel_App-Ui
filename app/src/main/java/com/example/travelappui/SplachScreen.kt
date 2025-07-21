package com.example.travelappui

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.img),
            null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
              text =   "Explore",
                fontSize = 65.sp,
                fontWeight = FontWeight.W900,
                color = Color.White,
                modifier = Modifier.padding(top = 130.dp)
                    .padding(bottom = 5.dp)
            )
            Text(
                text =   "The World",
                fontSize = 65.sp,
                fontWeight = FontWeight.W900,
                color = Color.White,

            )

            Text(
                text =   "Manage Your Trips",
                fontSize = 25.sp,
                fontWeight = FontWeight.W800,
                color = Color.White,
                modifier = Modifier.padding(top = 50.dp)
            )
            Text(
                text =   "with our App",
                fontSize = 25.sp,
                fontWeight = FontWeight.W800,
                color = Color.White
            )

            Text(
                text =   "Let's Start >",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(top = 15.dp)
            )


        }
    }

}


