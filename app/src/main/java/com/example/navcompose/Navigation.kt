package com.example.navcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.FirstScreen.route){
        composable(Routes.FirstScreen.route){
            FirstPage {  navController.navigate("second_screen") }
        }
        composable(Routes.SecondScreen.route){
            SecondPage{  navController.navigate("first_screen") }
        }
        composable(Routes.ThirdScreen.route){
            ThirdPage(name = "name")
        }
    }


}