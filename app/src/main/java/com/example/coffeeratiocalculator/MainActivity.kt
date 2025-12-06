package com.example.coffeeratiocalculator

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import com.example.coffeeratiocalculator.ui.navigation.AppNavGraph
import com.example.coffeeratiocalculator.ui.navigation.BottomBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            Scaffold(
                bottomBar = { BottomBar(navController) }
            ) {
                innerPadding ->
                AppNavGraph(
                    navController = navController,
                )
            }
        }
    }
}