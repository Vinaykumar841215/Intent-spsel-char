package com.example.aap

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class teacherimage(
    val context: Context, val yourData: ArrayList<NewData>,
    val teacheriClikListener: TeacherActivity4
):BaseAdapter() {


    //     val teacherarray= arrayOf("vinay","rohit","kumar")
//    val teacherarrayimage= arrayOf(R.drawable.fa,R.drawable.fa)
    override fun getCount(): Int {
        return yourData.size
    }

    override fun getItem(p0: Int): Any {
        return yourData[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("ViewHolder", "MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflate = LayoutInflater.from(context).inflate(R.layout.activity_teacher4, p2, false)
        val teachervie = inflate.findViewById<TextView>(R.id.textteacher)
        val teacherlist = inflate.findViewById<ImageView>(R.id.teacherimage)

        teacherlist.setImageResource(yourData[p0].image)
        teachervie.text = yourData[p0].name


        inflate.setOnClickListener() {
//            val toastView = LayoutInflater.from(context).inflate(R.layout.activity_toast3, null)
//            val toastTextView = toastView.findViewById<TextView>(R.id.toastVi)
//            toastTextView.text = yourData[p0].name
//
//            val toast = Toast.makeText(context, yourData[p0].name, Toast.LENGTH_SHORT)
//            toast.view = toastView
//            toast.show()



                teacheriClikListener.onProfileClik(yourData[p0].name,p0)
            }




        return inflate
    }
}



