package com.promecarus.mobileprogramming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.mobileprogramming.databinding.ActivityTugas04ListViewBinding

class Tugas04ListViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas04ListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas04ListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 4 | List View"
    }
}
