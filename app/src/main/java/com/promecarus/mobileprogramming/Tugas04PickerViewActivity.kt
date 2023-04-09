package com.promecarus.mobileprogramming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.mobileprogramming.databinding.ActivityTugas04PickerViewBinding

class Tugas04PickerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas04PickerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas04PickerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 4 | Picker View"
    }
}
