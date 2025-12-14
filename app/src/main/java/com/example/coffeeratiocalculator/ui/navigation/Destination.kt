package com.example.coffeeratiocalculator.ui.navigation

sealed class Destination(val route: String) {
    object home: Destination("home")
    object recipe: Destination("search")
    object addRecipe: Destination("addRecipe")
    object message: Destination("message")
    object profile: Destination("profile")
}