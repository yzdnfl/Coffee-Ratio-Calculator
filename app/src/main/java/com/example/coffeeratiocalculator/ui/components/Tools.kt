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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeratiocalculator.R
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
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // start row
            Text(
                text = "Tools",
                fontSize = 25.sp,
                fontFamily = myFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
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
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // start row
        Card(
            modifier = Modifier
                .fillMaxHeight()
                .padding(10.dp)
                .height(130.dp).weight(1f),
            onClick = { /*TODO*/ },
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp,   // Posisi diam (rendah)
                pressedElevation = 12.dp,  // Posisi ditekan (naik tinggi/terangkat)
                hoveredElevation = 6.dp    // (Opsional) Saat mouse lewat
            ),
            shape = RoundedCornerShape(35),
            colors = CardDefaults.cardColors(containerColor = Color.White),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .padding(10.dp)
                        .height(50.dp)
                        .width(50.dp)
                        .background(color = mainColor.copy(alpha = 0.3f), shape = RoundedCornerShape(100)),
                    contentAlignment = Alignment.Center,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.calculator),
                        contentDescription = "Calculator",
                    )
                }
                Text(
                    text = "Ratio",
                    fontFamily = myFontFamily,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        Card(
            modifier = Modifier
                .fillMaxHeight()
                .padding(10.dp)
                .height(130.dp).weight(1f),
            onClick = { /*TODO*/ },
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp,   // Posisi diam (rendah)
                pressedElevation = 12.dp,  // Posisi ditekan (naik tinggi/terangkat)
                hoveredElevation = 6.dp    // (Opsional) Saat mouse lewat
            ),
            shape = RoundedCornerShape(35),
            colors = CardDefaults.cardColors(containerColor = Color.White),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .padding(10.dp)
                        .height(50.dp)
                        .width(50.dp)
                        .background(color = mainColor.copy(alpha = 0.3f), shape = RoundedCornerShape(100)),
                    contentAlignment = Alignment.Center,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.timer),
                        contentDescription = "timer",
                    )
                }
                Text(
                    text = "Timer",
                    fontFamily = myFontFamily,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        Card(
            modifier = Modifier
                .fillMaxHeight()
                .padding(10.dp)
                .height(130.dp).weight(1f),
            onClick = { /*TODO*/ },
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp,   // Posisi diam (rendah)
                pressedElevation = 12.dp,  // Posisi ditekan (naik tinggi/terangkat)
                hoveredElevation = 6.dp    // (Opsional) Saat mouse lewat
            ),
            shape = RoundedCornerShape(35),
            colors = CardDefaults.cardColors(containerColor = Color.White),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .padding(10.dp)
                        .height(50.dp)
                        .width(50.dp)
                        .background(color = mainColor.copy(alpha = 0.3f), shape = RoundedCornerShape(100)),
                    contentAlignment = Alignment.Center,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.log),
                        contentDescription = "log",
                    )
                }
                Text(
                    text = "Log",
                    fontFamily = myFontFamily,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
        // end row
    }
}