package com.example.aap

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()  {
    lateinit var selecteDateTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selecteDateTextView = findViewById(R.id.text)

//        val showDatepickerButton = findViewById<Button>(R.id.button)
//        showDatepickerButton.setOnClickListener() {
//            showDatePicker()
//        }
//    }

//    fun showDatePicker() {
//        val calendar = Calendar.getInstance()
//
//        val year = calendar.get(Calendar.YEAR)
//        val month = calendar.get(Calendar.MONTH)
//        val day = calendar.get(Calendar.DATE)
//
//
//        selecteDateTextView.text = "$day/0${month + 1}/$year"
//
//        val datePicker = DatePickerDialog(
//            this@MainActivity,
//            DatePickerDialog.OnDateSetListener { datePicker, dayOfYear, dayOfMonth, dayOfDay ->
//
//                selecteDateTextView.text = "$dayOfDay/${dayOfMonth + 1}/$dayOfYear"
//                if (dayOfMonth >= 9) {
//                } else {
//                    selecteDateTextView.text = "$dayOfDay/0${dayOfMonth + 1}/$dayOfYear"
//
//                }
//
//            },
//            year,
//            month,
//            day)
//        datePicker.show()


        val email = findViewById<EditText>(R.id.email)
        val pass = findViewById<EditText>(R.id.pass)
        val submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener() {

            val text = pass.text.toString()
            var numberCount = 0
            var capitalLetter = 0
            var smallLetter = 0
            var specialChar = 0

            for (i in text) {
                for (j in 0..9) {
                    if (i.toString() == j.toString()) {
                        numberCount++
                    }
                }

                for (j in 'A'..'Z') {
                    if (i.toString() == j.toString()) {
                        capitalLetter++
                    }
                }


                for (j in 'a'..'z') {
                    if (i.toString() == j.toString()) {
                        smallLetter++
                    }
                }

                for (j in "@$!*&^_+") {
                    if (i.toString() == j.toString()) {
                        specialChar++
                    }
                }
            }

            if (numberCount == 0) {
                Toast.makeText(this, "Please fill any number", Toast.LENGTH_SHORT).show()
            } else if (smallLetter == 0) {
                Toast.makeText(this, "Please fill small letter", Toast.LENGTH_SHORT).show()
            } else if (specialChar == 0) {
                Toast.makeText(this, "Please fill special letter", Toast.LENGTH_SHORT).show()
            } else if (capitalLetter == 0) {
                Toast.makeText(this, "Please fill capital letter", Toast.LENGTH_SHORT).show()
            } else if (text.length <= 8) {
                Toast.makeText(this, "Please fill minumum 8", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this, splashActivity3::class.java))
            }

        }
    }
}