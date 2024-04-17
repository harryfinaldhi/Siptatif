package com.example.siptatif

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.siptatif.ui.theme.SiptatifTheme


@Composable
fun DataMahasiswa() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(50.dp))
            Text(text = "Data Mahasiswa", fontSize = 30.sp)

            // Informasi data mahasiswa (Box 1)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(1.dp, Color.Black)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(text = "Tanggal: 2024-03-11")
                    Text(text = "Nama: Harry Finaldhi")
                    Text(text = "NIM: 12250113594")
                    Text(text = "Email: harry@gmal.com")

                    // Status dan tombol
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(onClick = { /* Handle klik tombol */ }) {
                            Text(text = "Lihat")
                        }
                        Button(onClick = { /* Handle klik tombol */ }) {
                            Text(text = "Hapus")
                        }
                        Text(
                            text = "Menunggu",
                            modifier = Modifier.padding(bottom = 8.dp),
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Red
                        )
                    }
                }
            }

            // Informasi data mahasiswa (Box 2)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(1.dp, Color.Black)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(text = "Tanggal: 2024-03-11")
                    Text(text = "Nama: Harry Finaldhi")
                    Text(text = "NIM: 12250113594")
                    Text(text = "Email: harry@gmal.com")

                    // Status dan tombol
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(onClick = { /* Handle klik tombol */ }) {
                            Text(text = "Lihat")
                        }
                        Button(onClick = { /* Handle klik tombol */ }) {
                            Text(text = "Hapus")
                        }
                        Text(
                            text = "Disetujui",
                            modifier = Modifier.padding(bottom = 8.dp),
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Green
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DataMahasiswaPreview() {
    SiptatifTheme {
        DataMahasiswa()
    }
}
