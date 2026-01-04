package com.example.coffeeratiocalculator.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.coffeeratiocalculator.R
import com.example.coffeeratiocalculator.ui.theme.mainColor
import com.example.coffeeratiocalculator.ui.theme.myFontFamily
import java.time.LocalTime

@Composable
fun HeaderSection() {
    val greeting = remember { getGreetingMessage() }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(RoundedCornerShape(bottomEnd = 40.dp))
            .background(mainColor)
            .padding(horizontal = 24.dp)
            .padding(top = 24.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // profile picture
            ProfilePic(imageResId = R.drawable.profile, contentDescription = "")
            // greeting message
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = greeting)
                Text(
                    // belom dynamic buat namanya
                    text = "Barista",
                    fontFamily = myFontFamily,
                    fontWeight = FontWeight.SemiBold,
                )
            }
            Box(
                // notification button
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd
            ) {
                NotificationDropdown()
            }
            // tambahin apa lagi ya // end of column
        }
    }
}

@Composable
fun ProfilePic(imageResId: Int, contentDescription: String?) {
    Image(
        painter = painterResource(id = imageResId),
        contentDescription = contentDescription,
        modifier = Modifier
            .size(50.dp)
            .clip(CircleShape)
            .border(2.dp, color = Color.White, CircleShape)
    )
}

fun getGreetingMessage(): String {
    val currentHour = LocalTime.now().hour
    return when (currentHour) {
        in 5..11 -> "Good Morning"
        in 12..16 -> "Good Afternoon"
        in 16..20 -> "Good Evening"
        else -> "Good Night"
    }
}

@Composable
fun NotificationDropdown() {
    var isNotificationSelected by remember {mutableStateOf(true)}
    var expanded by remember {mutableStateOf(false)}
    Card(
        modifier = Modifier,
        shape = RoundedCornerShape(100),
        onClick = { expanded = !expanded },
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = !expanded },
            modifier = Modifier
                .background(color = Color.White)
        ) {
            DropdownMenuItem(
                modifier = Modifier,
                text = { Text("Notification on") },
                onClick = {
                    isNotificationSelected = true; expanded = false
                },
                trailingIcon = {
                    Image(
                        painterResource(R.drawable.notification),
                        contentDescription = "notification",
                        modifier = Modifier
                    )
                }
            )
            DropdownMenuItem(
                text = { Text("Notification off") },
                onClick = {
                    isNotificationSelected = false; expanded = false},
                trailingIcon = {
                    Image(
                        painterResource(R.drawable.notification_off),
                        contentDescription = "notification",
                        modifier = Modifier
                    )
                }
            )
        }
        Image(
            if (isNotificationSelected) painterResource(id = R.drawable.notification) else painterResource(id = R.drawable.notification_off),
            contentDescription = "notification",
            modifier = Modifier
                .padding(8.dp)
        )
    }
}