package com.promecarus.mobileprogramming.data

import java.io.Serializable

data class Berita(
    var judul: String = "",
    var gambar: String = "",
    var isi: String = "",
    var link: String = ""
) : Serializable
