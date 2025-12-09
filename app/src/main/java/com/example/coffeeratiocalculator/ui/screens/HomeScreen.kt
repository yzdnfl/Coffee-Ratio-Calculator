package com.example.coffeeratiocalculator.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.coffeeratiocalculator.ui.components.AddRecipeCard
import com.example.coffeeratiocalculator.ui.components.RecipeImageCard
import com.example.coffeeratiocalculator.ui.navigation.HeaderSection

val OrangeBrand = Color(0xFFFFA500)

@Composable
fun HomeScreen(
    onRecipeClick: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray)
    ) {
        HeaderSection()

        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxSize()
        ) {
            item {
                AddRecipeCard()
            }

            item {
                RecipeImageCard(
                    name = "Espresso",
                    onClick = { onRecipeClick("Espresso") }
                )
            }

            item {
                RecipeImageCard(
                    name = "Cappucino",
                    onClick = {
                        onRecipeClick("Cappucino")
                    }
                )
            }
        }
    }
}