package com.example.siptatif

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.siptatif.ui.theme.SiptatifTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController() // Inisialisasi NavController
            NavHost(navController = navController, startDestination = "login") {
                composable("login") { // Halaman login
                    Login(navController = navController) // Menjalankan fungsi Login dengan NavController
                }
                composable("registrasi") { // Halaman registrasi
                    Registrasi(navController = navController) // Menjalankan fungsi Registrasi dengan NavController
                }


            }

        }
    }
}



@Preview(showBackground = true)
@Composable
fun AppPreview() {
    val navController = rememberNavController()
    SiptatifTheme {
        Login(navController = navController)
    }
}