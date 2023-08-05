package com.example.feelfit.DietPlanGain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.feelfit.R

class yogurtchart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogurtchart)

        val arrowgainy = findViewById<ImageView>(R.id.arrowgainyogurt)
        arrowgainy.setOnClickListener {
            intent= Intent(this,DietPlanOne::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent)
            finish()
        }
    }
}