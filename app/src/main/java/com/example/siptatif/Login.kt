package com.example.siptatif

import com.example.siptatif.ui.theme.SiptatifTheme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.siptatif.R



@Composable
fun Login(navController: NavController) {
    // Buat state untuk menyimpan status login
    var isLoggedIn by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Form Login SIPTATIF",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Masukan email")
        })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Masukan password")
        })
        Spacer(modifier = Modifier.height(16.dp))
        TextButton(onClick = { }) {
            Text(text = "Lupa Pasword ?", textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth())
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            // Simulasikan login berhasil
            isLoggedIn = true
        }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Belum punya akun ?")
            Spacer(modifier = Modifier.width(1.dp))
            TextButton(onClick = {
                navController.navigate("registrasi")
            }) {
                Text(text = "Daftar sekarang")
            }
        }
    }

    // Navigasi ke halaman beranda setelah login berhasil
    if (isLoggedIn) {
        navController.navigate("home")
    }
}






