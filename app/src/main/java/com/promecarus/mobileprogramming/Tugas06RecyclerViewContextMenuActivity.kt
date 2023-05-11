package com.promecarus.mobileprogramming

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.mobileprogramming.databinding.ActivityTugas06RecyclerViewContextMenuBinding

class Tugas06RecyclerViewContextMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas06RecyclerViewContextMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas06RecyclerViewContextMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }

            R.id.setting -> {
                startActivity(Intent(this, SettingActivity::class.java))
                true
            }

            R.id.help -> {
                startActivity(Intent(this, HelpActivity::class.java))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}
