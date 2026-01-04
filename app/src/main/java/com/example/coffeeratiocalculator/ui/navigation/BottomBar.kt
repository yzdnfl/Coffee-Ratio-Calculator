package com.example.coffeeratiocalculator.ui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.coffeeratiocalculator.ui.theme.floatingNavigationColor
import com.example.coffeeratiocalculator.ui.theme.mainColor

@Composable
fun DynamicIsland() {

    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Home", "Search", "Add Recipe", "Message", "Profile")
    val icons = listOf(Icons.Default.Home, Icons.Default.Search, Icons.Default.Add, Icons.AutoMirrored.Filled.Message, Icons.Default.Person)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 24.dp)
            .height(64.dp)
            .background(color = Color.Transparent)
    ){
        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = floatingNavigationColor,
            shape = RoundedCornerShape(50),
            shadowElevation = 8.dp
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                items.forEachIndexed { index, item ->
                    val isSelected = selectedItem == index

                    IconButton(
                        onClick = {selectedItem = index},
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                    ) {
                        Icon(
                            imageVector = icons[index],
                            contentDescription = item,
                            tint = if (isSelected) mainColor else Color.Gray
                        )
                    }
                }
            }
        }
    }
}
