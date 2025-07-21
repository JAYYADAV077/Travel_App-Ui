package com.example.travelappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Search(navController: NavController) {

    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){

        Image(
            painter = painterResource(id = R.drawable.img_12),
            null,
            modifier = Modifier.align(Alignment.Start)
                .size(60.dp)
                .clickable{navController.navigate("Main")}
        )

        Text(
            text = "Search Reasult",
            color = Color.Black,
            modifier = Modifier.align(Alignment.Start),
            fontSize = 25.sp,
            fontWeight = FontWeight.W900
        )

        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color(0xFFEEEAEA))
                .padding(10.dp)

        ) {
            Column() {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(color = Color(0xFFD7DBE1))

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            null,
                            modifier = Modifier.size(50.dp)

                        )
                    }
                    Text(
                        text = "Southwest Airline",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W700,
                        color = Color(0xFF2331A4),
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 10.dp)
                    ) {
                        Text(
                            text = "NewYork",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 20.dp)

                        )
                        Text(
                            text = "JKF",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 20.dp)
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "2h 35m",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 10.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            null,
                            contentScale = ContentScale.Inside,
                            modifier = Modifier
                                .width(150.dp)

                        )


                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "LosAngles",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(
                            text = "LAX",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.img_8),
                            null,
                            modifier = Modifier.size(15.dp)
                        )
                        Text(
                            text = "4.5",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 5.dp)
                        )

                        Text(
                            text = "$270/per",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W900,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 170.dp)
                        )
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color(0xFFEEEAEA))
                .padding(10.dp)

        ) {
            Column() {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(color = Color(0xFFD7DBE1))

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            null,
                            modifier = Modifier.size(50.dp)

                        )
                    }
                    Text(
                        text = "Southwest Airline",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W700,
                        color = Color(0xFF2331A4),
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 10.dp)
                    ) {
                        Text(
                            text = "NewYork",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 20.dp)

                        )
                        Text(
                            text = "JKF",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 20.dp)
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "2h 35m",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 10.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            null,
                            contentScale = ContentScale.Inside,
                            modifier = Modifier
                                .width(150.dp)

                        )


                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "LosAngles",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(
                            text = "LAX",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.img_8),
                            null,
                            modifier = Modifier.size(15.dp)
                        )
                        Text(
                            text = "4.5",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 5.dp)
                        )

                        Text(
                            text = "$270/per",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W900,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 170.dp)
                        )
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color(0xFFEEEAEA))
                .padding(10.dp)

        ) {
            Column() {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(color = Color(0xFFD7DBE1))

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            null,
                            modifier = Modifier.size(50.dp)

                        )
                    }
                    Text(
                        text = "Southwest Airline",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W700,
                        color = Color(0xFF2331A4),
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 10.dp)
                    ) {
                        Text(
                            text = "NewYork",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 20.dp)

                        )
                        Text(
                            text = "JKF",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 20.dp)
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "2h 35m",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 10.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            null,
                            contentScale = ContentScale.Inside,
                            modifier = Modifier
                                .width(150.dp)

                        )


                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "LosAngles",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(
                            text = "LAX",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.img_8),
                            null,
                            modifier = Modifier.size(15.dp)
                        )
                        Text(
                            text = "4.5",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 5.dp)
                        )

                        Text(
                            text = "$270/per",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W900,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 170.dp)
                        )
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color(0xFFEEEAEA))
                .padding(10.dp)

        ) {
            Column() {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(color = Color(0xFFD7DBE1))

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            null,
                            modifier = Modifier.size(50.dp)

                        )
                    }
                    Text(
                        text = "Southwest Airline",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W700,
                        color = Color(0xFF2331A4),
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 10.dp)
                    ) {
                        Text(
                            text = "NewYork",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 20.dp)

                        )
                        Text(
                            text = "JKF",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 20.dp)
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "2h 35m",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 10.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            null,
                            contentScale = ContentScale.Inside,
                            modifier = Modifier
                                .width(150.dp)

                        )


                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "LosAngles",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(
                            text = "LAX",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.img_8),
                            null,
                            modifier = Modifier.size(15.dp)
                        )
                        Text(
                            text = "4.5",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 5.dp)
                        )

                        Text(
                            text = "$270/per",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W900,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 170.dp)
                        )
                    }
                }
            }
        }



    }
}

