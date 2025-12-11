package com.example.giffa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.giffa.screen.HomePage
import com.example.giffa.screen.HomePage2
import com.example.giffa.screen.HomePage3
import com.example.giffa.screen.MyScreen
import com.example.giffa.ui.theme.GiffaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GiffaTheme {
                Page1()
            }
        }
    }
}

@Composable
fun Page1() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {},
        topBar = {},
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color(0xFFFAF7F7))
        ) {
            // فقط اینجا NavHost را قرار می‌دهیم
            NavHost(
                navController = navController,
                startDestination = "home"
            ) {
                composable("home") {
                    HomePage(navController)
                }
                composable("screen2") {
                    HomePage2(navController)
                }
                composable("screen3") {
                    HomePage3(navController)
                }
                composable("screen4") {
                    MyScreen(navController)
                }
            }
        }
    }
}