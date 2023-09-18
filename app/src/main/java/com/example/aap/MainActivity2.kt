package com.example.aap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Handler().postDelayed(Runnable {
            val intent = Intent(this,TeacherActivity4::class.java)
            startActivity(intent)
            finish()
        },2000)


    }
}