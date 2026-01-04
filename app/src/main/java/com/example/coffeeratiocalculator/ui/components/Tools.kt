package com.example.coffeeratiocalculator.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeratiocalculator.R
import com.example.coffeeratiocalculator.ui.theme.floatingNavigationColor
import com.example.coffeeratiocalculator.ui.theme.mainColor
import com.example.coffeeratiocalculator.ui.theme.myFontFamily

@Composable
fun tools() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        // start column
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, top = 16.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // start row
            Text(
                text = "Tools",
                fontSize = 25.sp,
                fontFamily = myFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            )
            // end row
        }
        toolsComponent()
        // end column
    }
}

// BAGIAN BAWAH TOOLS
@Composable
fun toolsComponent() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        // box 1 Ratio
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(35),
                onClick = { /*TODO*/ }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Card(
                            modifier = Modifier
                                .padding(vertical = 8.dp),
                            shape = RoundedCornerShape(100),
                            colors = CardDefaults.cardColors(containerColor = mainColor.copy(alpha = 0.3f))
                        ) {
                            Image(
                                painterResource(R.drawable.calculator),
                                contentDescription = "calculator",
                                modifier = Modifier
                                    .padding(8.dp),
                                alignment = Alignment.Center,
                            )
                        }
                    }
                    Text(
                        text = "Ratio",
                        fontFamily = myFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        color = floatingNavigationColor
                    )
                }
            }
        }

        // box 2 Timer
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(35),
                onClick = { /*TODO*/ }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Card(
                            modifier = Modifier
                                .padding(vertical = 8.dp),
                            shape = RoundedCornerShape(100),
                            colors = CardDefaults.cardColors(containerColor = mainColor.copy(alpha = 0.3f))
                        ) {
                            Image(
                                painterResource(R.drawable.timer),
                                contentDescription = "timer",
                                modifier = Modifier
                                    .padding(8.dp),
                                alignment = Alignment.Center,
                            )
                        }
                    }
                    Text(
                        text = "Timer",
                        fontFamily = myFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        color = floatingNavigationColor
                    )
                }
            }
        }

        // box 3 Log
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(35),
                onClick = { /*TODO*/ }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Card(
                            modifier = Modifier
                                .padding(vertical = 8.dp),
                            shape = RoundedCornerShape(100),
                            colors = CardDefaults.cardColors(containerColor = mainColor.copy(alpha = 0.3f))
                        ) {
                            Image(
                                painterResource(R.drawable.log),
                                contentDescription = "log",
                                modifier = Modifier
                                    .padding(8.dp),
                                alignment = Alignment.Center,
                            )
                        }
                    }
                    Text(
                        text = "Log",
                        fontFamily = myFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        color = floatingNavigationColor
                    )
                }
            }
        }
    }
    // end row
}