package com.example.hamzalistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hamzalistview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    private lateinit var userArrayList: ArrayList<User>
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


         val imageId = intArrayOf(
             R.drawable.image2, R.drawable.image3 ,R.drawable.image4, R.drawable.image6,R.drawable.image5,
             R.drawable.item_1

         )
         val name = arrayOf(
             "Muhammad Hamza","Abdul Rahman","Ibrahim","Hassan","Muhammad","Hanan"

         )
         val lasMesTime = arrayOf(

             "9:00pm", "7:00pm", "4:06pm", "5:07pm", "8:10pm", "1:30pm"

         )

         val phoneNum  = arrayOf(

             "58029485874","45512432545","51454145543","45457879565","5464543879","45687457497"
         )

         val country = arrayOf(

             "Pakistan","United State", "Pakistan","Pakistan", "United State","China"
         )

         userArrayList = ArrayList()
         for (i in name.indices){
             val user = User(name[i],lasMesTime[i],phoneNum[i],country[i],imageId[i])
             userArrayList.add(user)
         }
         binding.listView.isClickable = true
         binding.listView.adapter = MyAdaptor(this,userArrayList)
         binding.listView.setOnItemClickListener { parent, view, position, id ->

             val name = name[position]
             val phone = phoneNum[position]
             val country = country[position]
             val imageId = imageId[position]
             val lasMesTime = lasMesTime[position]


             val i = Intent(this,UserActivity::class.java)
             i.putExtra("name",name)
             i.putExtra("phone",phone)
             i.putExtra("country",country)
             i.putExtra("imageId",imageId)
             i.putExtra("lasMesTime",lasMesTime)
             startActivity(i)
         }






    }


}