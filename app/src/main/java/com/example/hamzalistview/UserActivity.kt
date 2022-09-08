package com.example.hamzalistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hamzalistview.R
import com.example.hamzalistview.databinding.ActivityMainBinding
import com.example.hamzalistview.databinding.ActivityUserAcivityBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserAcivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserAcivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId",R.drawable.item_1)


        binding.profileName.text = name
        binding.countryName.text = country
        binding.phoneNum.text = phone
        binding.cardView2.setImageResource(imageId)



    }
}