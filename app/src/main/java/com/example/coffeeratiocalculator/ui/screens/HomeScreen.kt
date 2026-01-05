package com.example.coffeeratiocalculator.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.coffeeratiocalculator.ui.components.AddRecipeCard
import com.example.coffeeratiocalculator.ui.components.BottomEnd
import com.example.coffeeratiocalculator.ui.components.History
import com.example.coffeeratiocalculator.ui.components.LastBrew
import com.example.coffeeratiocalculator.ui.components.tools
import com.example.coffeeratiocalculator.ui.theme.bgColor

val OrangeBrand = Color(0xFFFFA500)

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = bgColor)
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {
            item {
                tools()
            }
            item{
                LastBrew()
            }
            item {
                History()
            }
            item {
                BottomEnd()
            }
        }
    }
}