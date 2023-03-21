package com.promecarus.mobileprogramming

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.mobileprogramming.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDialog.setOnClickListener { dialog() }
        binding.buttonToast.setOnClickListener { toast("Anda mengaktifkan toast") }
        binding.buttonMove.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "onDestroy")
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
