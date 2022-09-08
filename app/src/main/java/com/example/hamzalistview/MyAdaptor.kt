package com.example.hamzalistview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdaptor( private val context: Activity,private val arrayList: ArrayList<User>): ArrayAdapter<User>(context,
           R.layout.list_view,arrayList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_view,null)
        val imageView : ImageView = view.findViewById(R.id.profileImage)
        val textView : TextView =     view.findViewById(R.id.Username)
        val lastMsgtime : TextView = view.findViewById(R.id.Time)

        imageView.setImageResource(arrayList[position].imageId)
        textView.text = arrayList[position].name
        lastMsgtime.text = arrayList[position].lasMesTime
        return view
    }
}