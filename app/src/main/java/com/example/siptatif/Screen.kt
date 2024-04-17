package com.example.siptatif



sealed class Screens(val screen: String) {

data object Home: Screens("home")
data object DataMahasiswa: Screens("datamahasiswa")
data object Dosen: Screens("dosen")
}

