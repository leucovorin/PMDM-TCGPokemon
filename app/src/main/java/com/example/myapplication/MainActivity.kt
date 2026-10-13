package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.navegacion.AppNavHost
import com.example.myapplication.ui.navegacion.BottomBar
import com.example.myapplication.ui.navegacion.TopBar


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            MyApplicationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { TopBar(navController = navController) },
                    bottomBar = { BottomBar(navController = navController) }
                ) { innerPadding ->

                    AppNavHost(
                        navController = navController,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )

                }
            }
        }
    }
}