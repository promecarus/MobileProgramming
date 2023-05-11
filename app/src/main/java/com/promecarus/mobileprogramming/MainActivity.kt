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
            startActivity(Intent(this, Tugas01Activity::class.java))
        }

        binding.buttonTugas02.setOnClickListener {
            startActivity(Intent(this, Tugas02ExplicitIntentActivity::class.java))
        }

        binding.buttonTugas03.setOnClickListener {
            startActivity(Intent(this, Tugas03Activity::class.java))
        }

        binding.buttonTugas04.setOnClickListener {
            startActivity(Intent(this, Tugas04Activity::class.java))
        }

        binding.buttonTugas05.setOnClickListener {
            startActivity(Intent(this, Tugas05FragmentListActivity::class.java))
        }
        }
    }
}
