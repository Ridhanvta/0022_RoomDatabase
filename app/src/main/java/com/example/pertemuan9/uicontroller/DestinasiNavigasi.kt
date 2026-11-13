package com.example.pertemuan9.uicontroller

interface DestinasiNavigasi {
    // Nama Unik untuk menentukan jalur untuk composable
    val route: String
    // String resource id yang berisi judul yang akan ditampilkan di layar halaman.
    val titleRes: Int
}