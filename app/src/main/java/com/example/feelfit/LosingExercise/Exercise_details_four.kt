package com.example.feelfit.LosingExercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.feelfit.DietPlan.DietPlanTwo
import com.example.feelfit.DietPlanGain.DietPlanOne
import com.example.feelfit.R

class Exercise_details_four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_details_four)



        val arrow4 = findViewById<ImageView>(R.id.arrow4)
        arrow4.setOnClickListener {
            onBackPressed()


        }
    }
}