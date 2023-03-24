package com.promecarus.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.promecarus.mobileprogramming.databinding.ActivityTugas01Binding

class Tugas01Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas01Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas01Binding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 1"

        binding.buttonDialog.setOnClickListener { dialog() }
        binding.buttonToast.setOnClickListener { toast("Anda mengaktifkan toast") }
    }

    private fun dialog() {
        AlertDialog.Builder(this)
            .setTitle("Judul")
            .setMessage("Pesan yang tidak terlalu panjang")
            .setPositiveButton("Ya") { _, _ ->
                toast("Button ya terpilih")
            }
            .setNegativeButton("Tidak") { _, _ ->
                toast("Button tidak terpilih")
            }
            .setNeutralButton("Batal") { _, _ ->
                toast("Button batal terpilih")
            }
            .show()
    }

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
