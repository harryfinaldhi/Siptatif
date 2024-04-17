package com.example.siptatif

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.siptatif.ui.theme.SiptatifTheme

@Composable
fun BerkasMahasiswa() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Jenis Pendaftaran
            LabeledTextField(label = "Jenis Pendaftaran", value = "Individu")

            // Nama
            LabeledTextField(label = "Nama", value = "Harry Finaldhi")

            // Nim
            LabeledTextField(label = "Nim", value = "12250113594")

            // Email
            LabeledTextField(label = "Email", value = "harry@gmail.com")

            // Judul TA
            LabeledTextField(label = "Judul TA", value = "Siptatif")

            // Kategori TA
            LabeledTextField(label = "Kategori TA", value = "Laporan")

            // Calon Dosen Pembimbing 1
            LabeledTextField(label = "Calon Dosen Pembimbing 1", value = "fulan1")

            // Calon Dosen Pembimbing 2
            LabeledTextField(label = "Calon Dosen Pembimbing 2", value = "fulan2")

            // Tombol Buka PDF
            Button(
                onClick = { /* Handle klik tombol Buka PDF */ },
                modifier = Modifier.align(Alignment.Start)
            ) {
                Text(text = "Buka PDF")
            }

            // Pemilihan status berkas
            // Catatan untuk mahasiswa
            // Tombol Kembali dan Kirim
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Pemilihan status berkas
                // Catatan untuk mahasiswa
                // Tombol Kembali dan Kirim
                Column(modifier = Modifier.weight(1f)) {
                    // Pemilihan status berkas
                    TextField(
                        value = "",
                        onValueChange = { },
                        label = { Text(text = "Status Berkas") },
                        modifier = Modifier.fillMaxWidth(),
                        textStyle = TextStyle(fontSize = 14.sp)
                    )

                    // Catatan untuk mahasiswa
                    TextField(
                        value = "",
                        onValueChange = { },
                        label = { Text(text = "Catatan untuk Mahasiswa") },
                        modifier = Modifier.fillMaxWidth(),
                        textStyle = TextStyle(fontSize = 14.sp)
                    )
                }

                // Tombol Kembali dan Kirim
                Column(modifier = Modifier.weight(1f)) {
                    Button(onClick = { /* Handle klik tombol Kembali */ }) {
                        Text(text = "Kembali")
                    }
                    Button(onClick = { /* Handle klik tombol Kirim */ }) {
                        Text(text = "Kirim")
                    }
                }
            }
        }
    }
}
@Composable
fun LabeledTextField(label: String, value: String) {
    Column {
        Text(text = label, modifier = Modifier.padding(bottom = 4.dp))
        TextField(
            value = value,
            onValueChange = { },
            modifier = Modifier.fillMaxWidth(),
            textStyle = TextStyle(fontSize = 14.sp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BerkasMahasiswaPreview() {
    SiptatifTheme {
        BerkasMahasiswa()
    }
}