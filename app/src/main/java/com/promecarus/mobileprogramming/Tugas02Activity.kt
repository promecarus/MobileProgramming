package com.promecarus.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promecarus.mobileprogramming.databinding.ActivityTugas02Binding

class Tugas02Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas02Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas02Binding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 2"
    }
}
