package com.example.feelfit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivityOfExercises : AppCompatActivity() {

   lateinit var name1: TextView
   lateinit var imagedet:ImageView
   lateinit var det:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_of_exercises)


        name1=findViewById<TextView>(R.id.ExerName)
        imagedet=findViewById(R.id.exerGIF)
        det=findViewById(R.id.exerDetail)




        val exercise = intent.getSerializableExtra("exercise") as ExerciseDet
        imagedet.setImageResource(exercise.imageResId)
        name1.text = exercise.name
        det.text = exercise.detail


    }
}