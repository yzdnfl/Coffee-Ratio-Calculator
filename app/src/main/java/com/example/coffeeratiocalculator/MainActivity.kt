package com.example.coffeeratiocalculator

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.coffeeratiocalculator.ui.components.HeaderSection
import com.example.coffeeratiocalculator.ui.navigation.DynamicIsland
import com.example.coffeeratiocalculator.ui.screens.HomeScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                topBar = { HeaderSection() }
            ) {
                innerPadding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = innerPadding.calculateTopPadding())
                ){
                    HomeScreen()
                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                    ) {
                        DynamicIsland()
                    }
                }
            }
        }
    }
}