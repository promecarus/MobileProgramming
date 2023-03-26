package com.promecarus.mobileprogramming

import android.content.Intent
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

        binding.buttonSubmit.setOnClickListener {
            val i = Intent(this, Tugas02ImplicitIntentActivity::class.java)
                .putExtra("email", binding.editTextEmail.text.toString())
                .putExtra("kodePos", binding.editTextPostalCode.text.toString())
                .putExtra("nama", binding.editTextName.text.toString())
                .putExtra("telepon", binding.editTextTelephone.text.toString())
            startActivity(i)
        }
    }
}
