package com.example.coffeeratiocalculator.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.coffeeratiocalculator.ui.screens.HomeScreen
import com.example.coffeeratiocalculator.ui.screens.RecipeScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        // ke home
        composable("home") {
            HomeScreen(
                onAddClick = { navController.navigate("recipe") },
                onRecipeClick = { recipeId -> navController.navigate("recipe/$recipeId") }
            )
        }
        // ke recipe
        composable("recipe") {
            RecipeScreen()
        }
    }
}
