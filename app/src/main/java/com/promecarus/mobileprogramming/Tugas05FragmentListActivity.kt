package com.promecarus.mobileprogramming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.mobileprogramming.databinding.ActivityTugas05FragmentListBinding
import com.promecarus.mobileprogramming.fragment.BeritaListFragment

class Tugas05FragmentListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas05FragmentListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas05FragmentListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 5 | Fragment List"

        supportFragmentManager
            .beginTransaction()
            .add(R.id.frameLayout, BeritaListFragment())
            .commit()
    }
}
