package com.example.navcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondPage(onNavigateToFirstScreen:() ->Unit ) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Second Page", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(text = "Welcome")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { onNavigateToFirstScreen() }) {
            Text(text = "Go to First Page")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Go to Third Page")
        }
    }
}