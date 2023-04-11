package com.promecarus.mobileprogramming.data

import com.promecarus.mobileprogramming.R

object DataBerita {
    private val judul = arrayOf(
        "Berita 1",
        "Berita 2",
        "Berita 3"
    )

    private val deskripsi = arrayOf(
        "Deskripsi berita 1",
        "Deskripsi berita 2",
        "Deskripsi berita 3"
    )

    private val gambar = intArrayOf(
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background
    )

    private val isi = arrayOf(
        "Isi berita 1",
        "Isi berita 2",
        "Isi berita 3"
    )

    private val link = arrayOf(
        "https://google.com",
        "https://google.com",
        "https://google.com"
    )

    val listData: ArrayList<Berita>
        get() {
            val list = arrayListOf<Berita>()
            for (position in judul.indices) {
                val berita = Berita()
                berita.judul = judul[position]
                berita.deskripsi = deskripsi[position]
                berita.gambar = gambar[position]
                berita.isi = isi[position]
                berita.link = link[position]
                list.add(berita)
            }
            return list
        }
}
