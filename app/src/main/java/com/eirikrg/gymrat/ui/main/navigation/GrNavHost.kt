package com.eirikrg.gymrat.ui.main.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.eirikrg.gymrat.ui.main.features.home.navigation.HomeRoute
import com.eirikrg.gymrat.ui.main.features.home.navigation.homeScreen
import com.eirikrg.gymrat.ui.main.features.profile.navigation.profileScreen
import com.eirikrg.gymrat.ui.main.features.search.navigation.searchScreen

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController,
        startDestination = HomeRoute,
        modifier = modifier
    ) {
        homeScreen()
        searchScreen()
        profileScreen()
    }
}