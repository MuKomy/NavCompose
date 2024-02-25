package com.example.navcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.FirstScreen.route){
        composable(Routes.FirstScreen.route){
            FirstPage (navController)
        }
        composable(
            Routes.SecondScreen.route+ "?name ={name}",
            arguments= listOf(
                navArgument("name"){
                    type = NavType.StringType
                    defaultValue = "ENTER NAME"
                    nullable = true
                }
            )
        ){entry ->

            SecondPage(
                navController =navController, name = entry.arguments?.getString("name")
            )
        }
        composable(
            Routes.ThirdScreen.route+ "?name={name}",
            arguments= listOf(
                navArgument("name"){
                    type = NavType.StringType
                    //defaultValue = "ENTER NAME"
                    //nullable = true
                }
            )
        ){
            ThirdPage(
                navController =navController, name = it.arguments?.getString("name")
            )
        }
    }


}