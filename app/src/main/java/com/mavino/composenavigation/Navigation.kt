package com.mavino.composenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route){
        composable(route = Screen.MainScreen.route){
            MainScreen(navController = navController)
        }
        
        composable(
            route = Screen.DetailScreen.route + "/{name}",
            arguments = listOf(
                navArgument(name = "name"){
                    type = NavType.StringType
                    defaultValue = "Mavino"
                    nullable = true
                }
            )
        ){ entry ->
            DetailScreen(text = entry.arguments?.getString("name"))
        }
    }
}