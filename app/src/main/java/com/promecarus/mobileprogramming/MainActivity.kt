package com.promecarus.mobileprogramming

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonDialog.setOnClickListener { dialog() }

        buttonToast.setOnClickListener { toast("Anda mengaktifkan toast") }
    }

    private fun dialog() {
        val alertDialog = AlertDialog.Builder(this)
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
        alertDialog.show()
    }

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
