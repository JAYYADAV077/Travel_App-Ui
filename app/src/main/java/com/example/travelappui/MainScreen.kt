package com.example.travelappui

import androidx.compose.animation.Animatable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
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

    }

    }



@Preview(showBackground = true)
@Composable
private fun Uii() {
    MainScreen()
}