package com.promecarus.mobileprogramming

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.text.format.DateFormat
import androidx.appcompat.app.AppCompatActivity
import com.promecarus.mobileprogramming.databinding.ActivityTugas04PickerViewBinding
import java.text.DateFormatSymbols
import java.util.*

class Tugas04PickerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTugas04PickerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas04PickerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Tugas 4 | Picker View"

        binding.buttonCalendar.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            DatePickerDialog(
                this,
                { _, selectedYear, monthOfYear, dayOfMonth ->
                    binding.textView.text =
                        getString(
                            R.string.date_format,
                            dayOfMonth,
                            DateFormatSymbols().months[monthOfYear],
                            selectedYear
                        )
                },
                year,
                month,
                day
            ).show()
        }

        binding.buttonTime.setOnClickListener {
            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)

            val timePickerDialog = TimePickerDialog(
                this,
                { _, hourOfDay, minuteOfHour ->
                    binding.textView.text = getString(R.string.time_format, hourOfDay, minuteOfHour)
                },
                hour,
                minute,
                DateFormat.is24HourFormat(this)
            )
            timePickerDialog.show()
        }
    }

}
