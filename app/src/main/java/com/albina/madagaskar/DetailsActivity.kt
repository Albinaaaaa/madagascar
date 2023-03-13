package com.albina.madagaskar

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {

    lateinit var nameOfAnimal: TextView
    lateinit var descOfAnimal: TextView
    lateinit var photo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        nameOfAnimal = findViewById(R.id.tv_anmial_name)
        descOfAnimal = findViewById(R.id.tv_animal_description)
        photo = findViewById(R.id.iv_animal_photo)

        var receivedName = intent.getStringExtra("passingName")
        var receivedDesc = intent.getStringExtra("passingDesc")

        nameOfAnimal.text = receivedName
        descOfAnimal.text = receivedDesc

        when (receivedName){
            "Alex" -> photo.setImageResource(R.drawable.lion)
            "Marty" -> photo.setImageResource(R.drawable.zebra)
            "Mort" -> photo.setImageResource(R.drawable.mort)
        }

    }
}