package com.example.coffeeratiocalculator.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            //start card
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .height(24.dp)
                    .width(24.dp),
                onClick = {
                    // Tambahkan aksi yang sesuai di sini
                },
                shape = RoundedCornerShape(100),
            ) {}
            // end card

            Text(
                text = "Foto profile"
            )
            Text(
                text = "BIODATA"
            )
        }
    }
}