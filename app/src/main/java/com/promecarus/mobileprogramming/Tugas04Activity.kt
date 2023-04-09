package com.promecarus.mobileprogramming

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.mobileprogramming.databinding.ActivityTugas04Binding

class Tugas04Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas04Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas04Binding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 4 | View"

        binding.buttonPickerView.setOnClickListener {
            val i = Intent(this, Tugas04PickerViewActivity::class.java)
            startActivity(i)
        }

        binding.buttonListView.setOnClickListener {
            val i = Intent(this, Tugas04ListViewActivity::class.java)
            startActivity(i)
        }
    }
}
