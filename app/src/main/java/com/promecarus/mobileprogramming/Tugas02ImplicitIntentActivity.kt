package com.promecarus.mobileprogramming

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
    }
}
