package com.eirikrg.gymrat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.compose.GymRatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GymRatTheme {
                // Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> }
            }
        }
    }
}