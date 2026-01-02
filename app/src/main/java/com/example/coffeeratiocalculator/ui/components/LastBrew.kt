package com.example.coffeeratiocalculator.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeratiocalculator.R
import com.example.coffeeratiocalculator.ui.theme.mainColor
import com.example.coffeeratiocalculator.ui.theme.myFontFamily

@Composable
fun LastBrew() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 24.dp)
    ) {
        Column() {
            Text(
                text = "Last Brew",
                fontSize = 25.sp,
                fontFamily = myFontFamily,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )
            Card(
                modifier = Modifier
                    .fillMaxSize(),
                shape = RoundedCornerShape(50),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Row pertama waktu dan like
                        Card(
                            modifier = Modifier
                                .padding(8.dp),
                            shape = RoundedCornerShape(100),
                            colors = CardDefaults.cardColors(containerColor = mainColor)
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(horizontal = 8.dp)
                                    .padding(vertical = 4.dp),
                                Arrangement.spacedBy(8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.history),
                                    contentDescription = "history",
                                )
                                Text(
                                    text = "2H AGO",
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .clip(CircleShape),
                            colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.3f))) {
                            Text(
                                text = "like button"
                            )
                        }
                    }
                    Text(
                        text = "Ethiopia Yirgacheffe"
                    )
                }
            }
        }
    }
}