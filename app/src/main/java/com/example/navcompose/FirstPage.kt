package com.example.navcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun FirstPage(
    onNavigateToSecondScreen :() -> Unit,
    onNavigateToThirdScreen :() -> Unit
              ){
    val navController = rememberNavController()
    var name by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("First Page", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        TextField(value = name, onValueChange = {name = it})
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {onNavigateToSecondScreen() }) {
            Text(text = "Go to Second Page")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onNavigateToThirdScreen() }) {
            Text(text = "Go to Third Page")
        }
    }
}

