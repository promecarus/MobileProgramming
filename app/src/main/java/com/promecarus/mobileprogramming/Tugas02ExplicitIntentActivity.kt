package com.promecarus.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promecarus.mobileprogramming.databinding.ActivityTugas02ExplicitIntentBinding

class Tugas02ExplicitIntentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas02ExplicitIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas02ExplicitIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 2 | Explicit Intent"
    }
}
