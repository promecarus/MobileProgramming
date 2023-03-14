package com.promecarus.mobileprogramming

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_dialog.setOnClickListener{
            val alertDialog = AlertDialog.Builder(this@MainActivity)

            alertDialog.setTitle("Ini adalah judul alert dialog")
            alertDialog.setMessage("Ini adalah message alert dialog")

            alertDialog.setPositiveButton("Ya", DialogInterface.OnClickListener{dialog, which ->
                Toast.makeText(
                    this@MainActivity,
                    "Ya",
                    Toast.LENGTH_SHORT
                ).show()
            })

            alertDialog.setNegativeButton("Tidak", DialogInterface.OnClickListener{dialog, which ->
                Toast.makeText(
                    this@MainActivity,
                    "Tidak",
                    Toast.LENGTH_SHORT
                ).show()
            })

            alertDialog.setNeutralButton("Batal", DialogInterface.OnClickListener{dialog, which ->
                Toast.makeText(
                    this@MainActivity,
                    "Batal",
                    Toast.LENGTH_SHORT
                ).show()
            })

            alertDialog.show()
        }

        button_toast.setOnClickListener{
            Toast.makeText(this, "Ini adalah toast", Toast.LENGTH_SHORT).show()
        }
    }
}
