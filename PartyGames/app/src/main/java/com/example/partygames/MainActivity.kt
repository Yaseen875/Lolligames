package com.example.partygames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.partygames.aboutdevs.AboutDevs
import com.example.partygames.contactus.ContactUs
import com.example.partygames.diceroller.DiceRollerScreen
import com.example.partygames.home.HomeScreen
import com.example.partygames.playmenu.PlayMenu
import com.example.partygames.settings.Settings
import com.example.partygames.ui.theme.PartyGamesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "HomeScreen", builder = {
                composable(Routes.homescreen){
                    HomeScreen(navController)
                }
                composable(Routes.diceroller){
                    DiceRollerScreen(navController)
                }
                composable(Routes.playmenu){
                    PlayMenu(navController)
                }
                composable(Routes.settings){
                    Settings()
                }
                composable(Routes.aboutdevs){
                    AboutDevs(navController)
                }
                composable(Routes.contactus){
                    ContactUs(navController)
                }
            } )
        }
    }
}
