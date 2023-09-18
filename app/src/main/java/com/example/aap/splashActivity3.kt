package com.example.aap

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class splashActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash3)
        
        val viewList = findViewById<ListView>(R.id.listView)
        val clik = findViewById<TextView>(R.id.clik)
        val nameArray= arrayOf("Vinay","Azim","Rahul","Bipul","Prince")
        
        val nameArrayActivity = ArrayAdapter(this,R.layout.name_list_view,nameArray)
        
        viewList.adapter= nameArrayActivity

        clik.setOnClickListener {
            val intent= Intent(this,TeacherActivity4::class.java)
             startActivity(intent)
        }

        viewList.setOnItemClickListener { adapterView, view, i, l ->

            val item= nameArray[i]
            Toast.makeText(this, "$item", Toast.LENGTH_SHORT).show()
        }
        
    }
}