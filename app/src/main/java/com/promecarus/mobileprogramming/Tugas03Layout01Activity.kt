package com.promecarus.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promecarus.mobileprogramming.databinding.ActivityTugas03Layout01Binding

class Tugas03Layout01Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas03Layout01Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas03Layout01Binding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Layout 1"
    }
}
