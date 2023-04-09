package com.promecarus.mobileprogramming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promecarus.mobileprogramming.databinding.ActivityTugas03Binding

class Tugas03Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas03Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas03Binding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 3 | Layout"

        binding.buttonLayout1.setOnClickListener {
            val i = Intent(this, Tugas03Layout01Activity::class.java)
            startActivity(i)
        }

        binding.buttonLayout2.setOnClickListener {
            val i = Intent(this, Tugas03Layout02Activity::class.java)
            startActivity(i)
        }
    }
}
