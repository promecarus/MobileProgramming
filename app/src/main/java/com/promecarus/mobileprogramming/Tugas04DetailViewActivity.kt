package com.promecarus.mobileprogramming

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.promecarus.mobileprogramming.data.Berita
import com.promecarus.mobileprogramming.databinding.ActivityTugas04DetailViewBinding

class Tugas04DetailViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas04DetailViewBinding

    companion object {
        private const val EXTRA_JUDUL = "judul"
        private const val EXTRA_GAMBAR = "gambar"
        private const val EXTRA_ISI = "isi"
        private const val EXTRA_LINK = "link"

        fun newIntent(context: Context, berita: Berita): Intent {
            return Intent(context, Tugas04DetailViewActivity::class.java)
                .putExtra(EXTRA_JUDUL, berita.judul)
                .putExtra(EXTRA_GAMBAR, berita.gambar)
                .putExtra(EXTRA_ISI, berita.isi)
                .putExtra(EXTRA_LINK, berita.link)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas04DetailViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 4 | Detail View"

        binding.beritaDetailJudul.text = intent.getStringExtra(EXTRA_JUDUL)
        Glide
            .with(this)
            .load(intent.getStringExtra(EXTRA_GAMBAR))
            .centerCrop()
            .into(binding.beritaDetailGambar)
        binding.beritaDetailIsi.text = intent.getStringExtra(EXTRA_ISI)
        binding.beritaDetailLink.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(intent.getStringExtra(EXTRA_LINK))))
        }
    }
}
