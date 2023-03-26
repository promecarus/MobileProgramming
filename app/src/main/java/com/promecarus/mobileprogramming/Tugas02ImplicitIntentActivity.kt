package com.promecarus.mobileprogramming

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promecarus.mobileprogramming.databinding.ActivityTugas02ImplicitIntentBinding

class Tugas02ImplicitIntentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas02ImplicitIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas02ImplicitIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 2 | Implicit Intent"

        val email = intent.getStringExtra("email")
        val kodePos = intent.getStringExtra("kodePos")
        val nama = intent.getStringExtra("nama")
        val telepon = intent.getStringExtra("telepon")

        binding.textViewDataEmail.text = if (email.isNullOrBlank()) "Tidak diisi" else email
        binding.textViewDataKodePos.text = if (kodePos.isNullOrBlank()) "Tidak diisi" else kodePos
        binding.textViewDataNama.text = if (nama.isNullOrBlank()) "Tidak diisi" else nama
        binding.textViewDataTelepon.text = if (telepon.isNullOrBlank()) "Tidak diisi" else telepon

        binding.buttonActionBrowser.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=$nama"))
            startActivity(i)
        }
        binding.buttonActionEmail.setOnClickListener {
            val i = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
            startActivity(i)
        }
        binding.buttonActionMap.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=$kodePos"))
            startActivity(i)
        }
        binding.buttonActionTelephoneCall.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$telepon"))
            startActivity(i)
        }
        binding.buttonActionTelephoneSms.setOnClickListener {
            val i = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$telepon"))
            startActivity(i)
        }
    }
}
