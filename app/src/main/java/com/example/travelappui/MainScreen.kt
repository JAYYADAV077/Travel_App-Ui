package com.example.travelappui

import androidx.compose.animation.Animatable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.traceEventStart
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import java.nio.file.WatchEvent



@Composable
fun Splash(navController: NavController) {
    class NavItem(val label: String, val icon: ImageVector) {
    }

    val navList = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Notification", Icons.Default.Place),
        NavItem("Settings", Icons.Default.Favorite),
        NavItem("Settings", Icons.Default.Person)

    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = false,
                        onClick = { },
                        icon = {
                            Icon(
                                navItem.icon,
                                contentDescription = "",
                                tint = androidx.compose.ui.graphics.Color.Black,
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    )
                }
            }
        }
    )
    { innerPadding ->
        MainScreen(
            modifier = Modifier.padding(innerPadding),navController

        )

    } //

}








@Composable
fun MainScreen(modifier: Modifier,navController: NavController) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.img_2),
                    null,                             //profle
                    modifier = Modifier.size(55.dp)
                )


                Text(
                    text = "Tina Anderson",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.W800, //name
                    color = Color.Black,
                    modifier = Modifier.padding(start = 15.dp)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.img_1),
                null,
                modifier = Modifier.size(40.dp)  //belliocn
            )
        }

        Spacer(modifier = Modifier.height(35.dp))


        Text(
            text = "Travel Made\nEffortless",
            fontSize = 25.sp,
            fontWeight = FontWeight.W800,
            color = Color.Black,
            modifier = Modifier.align(Alignment.Start)

        )

        Spacer(modifier = Modifier.height(25.dp))


        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = Color(0xFFB6D9D6))
                    .size(70.dp)
            ) {
                Column() {
                    Text(
                        text = "Travel",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W800,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        null,
                        modifier = Modifier
                            .size(50.dp)
                            .offset(x = 20.dp, y = 12.dp)
                    )
                }
            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = Color(0xFFAEC0DA))
                    .size(70.dp)
            ) {
                Column() {
                    Text(
                        text = "Flight",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W800,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.img_5),
                        null,
                        modifier = Modifier
                            .size(50.dp)
                            .offset(x = 20.dp, y = 12.dp)
                    )
                }
            }


            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = Color(0xFF9F8AD0))
                    .size(70.dp)
            ) {
                Column() {
                    Text(
                        text = "Boats",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W800,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.img_4),
                        null,
                        modifier = Modifier
                            .size(50.dp)
                            .offset(x = 20.dp, y = 12.dp)
                    )
                }
            }


            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = Color(0xFFE0B5BF))
                    .size(70.dp)
            ) {
                Column() {
                    Text(
                        text = "Bus",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W800,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 5.dp, top = 5.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.img_6),
                        null,
                        modifier = Modifier
                            .size(50.dp)
                            .offset(x = 20.dp, y = 12.dp)
                    )
                }
            }

        }

        //row end

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Upcoming Schedules",
            fontSize = 15.sp,
            fontWeight = FontWeight.W700,
            color = Color.Gray,
            modifier = Modifier.align(Alignment.Start)
        )


        Spacer(modifier = Modifier.height(15.dp))


        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color(0xFFEEEAEA))
                .padding(10.dp)
                .clickable{navController.navigate("Search")}

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

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Recommendation Places",
            fontSize = 16.sp,
            fontWeight = FontWeight.W900,
            color = Color.Black,
            modifier = Modifier.align(Alignment.Start)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {

            Box(
                modifier = Modifier.width(170.dp).clip(RoundedCornerShape(20.dp))
                    .height(220.dp)
                // or your desired size
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_11),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,

                    modifier = Modifier.clip(RoundedCornerShape(15.dp))
                )

                // Label at the bottom
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .align(Alignment.BottomStart)
                        .background(Color(0x88000000)) // Black with 50% transparency
                        .padding(8.dp)
                ) {
                    Text(
                        text = "Royal Beach",
                        color = Color.White,
                        modifier = Modifier.align(Alignment.TopCenter),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }


            Box(
                modifier = Modifier.width(170.dp).clip(RoundedCornerShape(20.dp))
                    .height(220.dp)
            // or your desired size
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_10),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,

                    modifier = Modifier.clip(RoundedCornerShape(15.dp))
                )

                // Label at the bottom
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .align(Alignment.BottomStart)
                        .background(Color(0x88000000)) // Black with 50% transparency
                        .padding(8.dp)
                ) {
                    Text(
                        text = "Royal Beach",
                        color = Color.White,
                        modifier = Modifier.align(Alignment.TopCenter),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

    }

}


@Composable
fun tset(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier.clip(RoundedCornerShape(10.dp))
            .height(500.dp) // or your desired size
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_10),
            contentDescription = null,
            contentScale = ContentScale.Crop,

            modifier = Modifier.clip(RoundedCornerShape(10.dp)).fillMaxSize()
        )

        // Label at the bottom
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .align(Alignment.BottomStart)
                .background(Color(0x88000000)) // Black with 50% transparency
                .padding(8.dp)
        ) {
            Text(
                text = "Royal Beach",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center),
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

}
