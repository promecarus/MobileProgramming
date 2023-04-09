package com.promecarus.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promecarus.mobileprogramming.databinding.ActivityTugas03Layout02Binding

class Tugas03Layout02Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas03Layout02Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas03Layout02Binding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Layout 2"
    }
}
