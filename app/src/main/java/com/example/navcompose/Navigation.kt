package com.example.navcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.FirstScreen.route){
        composable(Routes.FirstScreen.route){
            FirstPage()
        }
        composable(Routes.SecondScreen.route){
            SecondPage(name = "name")
        }
        composable(Routes.ThirdScreen.route){
            ThirdPage(name = "name")
        }
    }


}