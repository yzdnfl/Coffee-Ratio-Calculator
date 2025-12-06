package com.example.coffeeratiocalculator.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeScreen(
    onSartCalculate: () -> Unit = {}
) {
    Text(text = "Home Screen")
    Scaffold {
        innerPadding ->
        // bagian atas
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(innerPadding)
                .padding(
                    top = 100.dp,
                    start = 50.dp,
                    end = 50.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // bagian atas
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Coffee Ratio Calculator",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Hitung perbandingan kopi dan air dengan mudah",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            // bagian tengah
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(
                        bottom = 200.dp,
                        top = 0.dp
                        ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val shape = CircleShape
                Text(
                    text = "Mulai dengan satu klik",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(Modifier.height(12.dp))
                Button(
                    onClick = onSartCalculate,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(innerPadding)
                        .padding(
                            start = 30.dp,
                            end = 30.dp
                        )
                        .border(5.dp, MaterialTheme.colorScheme.secondary, shape)
                        .background(MaterialTheme.colorScheme.primary, shape),
                ) {
                    // bagian bawah
                    Text(
                        text = "Calculate",
                        style = MaterialTheme.typography.bodySmall,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}