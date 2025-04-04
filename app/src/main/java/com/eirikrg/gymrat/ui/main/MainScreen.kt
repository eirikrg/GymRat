package com.eirikrg.gymrat.ui.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.eirikrg.gymrat.R
import com.eirikrg.gymrat.ui.main.features.home.navigation.HomeRoute
import com.eirikrg.gymrat.ui.main.features.profile.navigation.ProfileRoute
import com.eirikrg.gymrat.ui.main.features.search.navigation.SearchRoute
import com.eirikrg.gymrat.ui.main.navigation.NavigationGraph
import com.example.compose.GymRatTheme

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavigationGraph(navController, Modifier.padding(innerPadding))
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(
        BottomNavItem(HomeRoute, stringResource(R.string.home_nav_bar), Icons.Default.Home),
        BottomNavItem(SearchRoute, stringResource(R.string.search_nav_bar), Icons.Default.Search),
        BottomNavItem(ProfileRoute, stringResource(R.string.profile_nav_bar), Icons.Default.Person)
    )
    var selectedItem by remember { mutableIntStateOf(0) }

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

data class BottomNavItem(val route: Any, val label: String, val icon: ImageVector)

@Preview
@Composable
fun MainScreenPreview() {
    GymRatTheme {
        MainScreen()
    }
}
