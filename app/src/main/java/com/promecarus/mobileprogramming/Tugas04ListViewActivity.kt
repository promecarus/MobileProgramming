package com.promecarus.mobileprogramming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.mobileprogramming.adapter.BeritaAdapter
import com.promecarus.mobileprogramming.data.Berita
import com.promecarus.mobileprogramming.data.DataBerita
import com.promecarus.mobileprogramming.databinding.ActivityTugas04ListViewBinding

class Tugas04ListViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas04ListViewBinding
    private var beritaList: ArrayList<Berita> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas04ListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 4 | List View"
        beritaList.addAll(DataBerita.listData)

        binding.listView.adapter = BeritaAdapter(this, beritaList)

        binding.listView.setOnItemClickListener { _, _, position, _ ->
            startActivity(Tugas04DetailViewActivity.newIntent(this, beritaList[position]))
        }
    }
}
