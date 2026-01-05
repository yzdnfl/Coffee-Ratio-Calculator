package com.example.coffeeratiocalculator.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import com.example.coffeeratiocalculator.ui.theme.mainGray

@Composable
fun History() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "History",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 25.sp,
                    color = Color.Black)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.CenterEnd
                ) {
                    TextButton(onClick = {}) {
                        Text(text = "VIEW ALL",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Gray
                        )
                    }
                }
            }
            HistoryComponents()
            HistoryComponents()
            HistoryComponents()
        }
    }
}

@Composable
fun HistoryComponents() {
    Box(
        // invisible container
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    ) {
        Card(
            // visible container for history components
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {},
            shape = RoundedCornerShape(100),
            elevation = CardDefaults.cardElevation(2.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Row(
                // positioning
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {


                Box(
                    // invisible for image
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.5f)
                ) {
                    Card(
                        // visible container for icon
                        modifier = Modifier,
                        shape = RoundedCornerShape(100),
                    ) {
                        Image(
                            painterResource(R.drawable.mug),
                            contentDescription = "history",
                            modifier = Modifier
                                .background(color = mainGray)
                                .padding(16.dp),
                            alignment = Alignment.Center
                        )
                    }
                }


                Box(
                    // invisible for text
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1.5f)
                ) {
                    Column(
                        // vertical positioning for text
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(text = "Ethiopia Yirgacheffe",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            fontSize = 14.sp)
                        Text(text = "V60 Pour Over" + " \u2022 "  + "Yestrerday",
                            fontSize = 11.sp)
                    }
                }


                Box(
                    // invisible for rating
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.CenterEnd

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = "4.0",
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            modifier = Modifier
                                .padding(horizontal = 8.dp)
                        )
                        Icon(
                            painterResource(R.drawable.star_unrated),
                            contentDescription = "star",
                            tint = mainColor
                        )
                    }
                }
            }
        }
    }
}