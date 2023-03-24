package com.promecarus.mobileprogramming

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.mobileprogramming.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonTugas01.setOnClickListener {
            val i = Intent(this, Tugas01Activity::class.java)
            startActivity(i)
        }

        binding.buttonTugas02.setOnClickListener {
            val i = Intent(this, Tugas02Activity::class.java)
            startActivity(i)
        }
    }
}
