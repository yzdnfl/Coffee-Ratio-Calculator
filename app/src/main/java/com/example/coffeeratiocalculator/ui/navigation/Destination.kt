package com.example.coffeeratiocalculator.ui.navigation

sealed class Destination(val route: String) {
    object home: Destination("home")
    object settings: Destination("settings")
}