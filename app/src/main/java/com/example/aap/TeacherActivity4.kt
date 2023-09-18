package com.example.aap

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListView

class TeacherActivity4 : AppCompatActivity() {
lateinit var NewData:ArrayList<NewData>
lateinit var adapter: splashActivity3
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher4)

        val teacherList = findViewById<ListView>(R.id.teacherView)


        NewData("Naushad", R.drawable.fa),
        NewData("Azim", R.drawable.ic_launcher_background),
        NewData("Vinay", R.drawable.vvv)
        )


       
        teacherList.adapter = teacherimage(this, NewData)


    }



}