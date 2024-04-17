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
fun Dosen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally // Mengatur alignment horizontal ke tengah
        ) {
            Spacer(modifier = Modifier.height(16.dp)) // Spasi tambahan dari atas

            // Teks "Data dosen pembimbing" tetap di tengah
            Column(
                modifier = Modifier.fillMaxWidth(), // Mengisi lebar penuh
                horizontalAlignment = Alignment.CenterHorizontally // Mengatur alignment horizontal ke tengah
            ) {
                Text(text = "Data dosen pembimbing", fontSize = 20.sp)
            }

            // Tombol Add di luar Column
            Button(
                onClick = { /* Handle klik tombol Add */ },
                modifier = Modifier.align(Alignment.Start) // Mengatur alignment tombol ke kiri
            ) {
                Text(text = "+ Add")
            }

            // Informasi data dosen
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
                    Text(text = "Nama Dosen: John Doe")
                    Text(text = "NIDN: 1234567890")
                    Text(text = "Kuota: 30")
                    Text(text = "Keahlian: Machine Learning")

                    // Tombol Edit, Hapus, Detail
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(onClick = { /* Handle klik tombol Edit */ }) {
                            Text(text = "Edit")
                        }
                        Button(onClick = { /* Handle klik tombol Hapus */ }) {
                            Text(text = "Hapus")
                        }
                        Button(onClick = { /* Handle klik tombol Detail */ }) {
                            Text(text = "Detail")
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DosenPreview() {
    SiptatifTheme {
        Dosen()
    }
}
