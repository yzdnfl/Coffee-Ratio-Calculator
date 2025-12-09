package com.example.coffeeratiocalculator.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomBar(navController: NavController) {
    NavigationBar(windowInsets = NavigationBarDefaults.windowInsets) {
        val currentRoute = navController.currentDestination?.route

        NavigationBarItem(
            selected = currentRoute == "home",
            onClick = { navController.navigate("home") },
            label = { Text(text = "Home") },
            icon = { Icon(Icons.Filled.Home, contentDescription = "Home") }
        )

        NavigationBarItem(
            selected = currentRoute == "recipe",
            onClick = { navController.navigate("recipe") },
            label = { Text(text = "recipe") },
            icon = { Icon(Icons.Filled.Settings, contentDescription = "recipe") }
        )
    }
}
