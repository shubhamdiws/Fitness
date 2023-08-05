package com.example.feelfit.LosingExercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feelfit.*
import com.example.feelfit.Adapter.customAdapter
import java.util.ArrayList

class ExerciseI : AppCompatActivity(), customAdapter.MyClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_i)

        val exercises = arrayOf(
            ExerciseDet("Running", R.drawable.crunchess, "Running is benefecial"),
            ExerciseDet("Jump", R.drawable.crunchess, "Jumping japak"),
            ExerciseDet("Squat", R.drawable.crunchess, "Squatting")
        )


        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view1)
        recyclerView.layoutManager= LinearLayoutManager(this)

        val data = ArrayList<itemview>()

        data.add(itemview(R.drawable.gain1, R.drawable.jog,"RUNNING"))
        data.add(itemview(R.drawable.gain2, R.drawable.plank,"PLANK"))
        data.add(itemview(R.drawable.gain3, R.drawable.jumpingrope,"JUMP ROPE"))
        data.add(itemview(R.drawable.gain4, R.drawable.burpeesexercise,"BURPESS"))
        data.add(itemview(R.drawable.gain5, R.drawable.pushup,"PUSHUP"))
        data.add(itemview(R.drawable.gain6, R.drawable.crunchess,"CRUNCHES"))
        data.add(itemview(R.drawable.seven, R.drawable.no,"INTERMITENT\n FASTING"))

        val adapter = customAdapter(data,this@ExerciseI)
        recyclerView.adapter=adapter
        recyclerView.setHasFixedSize(true)


    }
    override fun onClick(position: Int) {


        when(position)
        {
            0 -> {

                val exercise = ExerciseDet("Running",R.drawable.running," \n    BENEFITS:-\n -Running is an excellent form \n    of exercise for weight loss.\n  -It burns a lot of calories.\n -Running is one of the best \n    forms of exercise to lose belly \n    fat.  \n- If you run 8-10 kilometres daily, \n    then you can burn 350 calories \n    more than walking.") // get the selected exercise
                intent = Intent(this, DetailActivityOfExercises::class.java)
                intent.putExtra("exercise",exercise)
                startActivity(intent)

//                intent = Intent(this,DetailActivityOfExercises::class.java)
//                intent.putExtra("name","12")
//                startActivity(intent)

//                startActivity(Intent(this, DetailActivityOfExercises::class.java))
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

            }

            1 -> {

                val exercise = ExerciseDet("planck",R.drawable.planck," BENEFITS:-\n  -Improves Body Alignment and   Helps Avoid Illness.\n -Build Core Strength.\n  -Improves Flexibility.\n\n  - Improves Metabolism.\n  -Improves Overall Mental \n     Health.\n") // get the selected exercise
                intent = Intent(this, DetailActivityOfExercises::class.java)
                intent.putExtra("exercise",exercise)
                startActivity(intent)
//

               }
            2 -> {

                val exercise = ExerciseDet("Jumping",R.drawable.jumping,"\n   BENEFITS:-\n\n  -Burn Calories. Jumping rope \\n     helps to burn calories.\\n\\n  -Decrease Belly Fat.\\n\\n  -Jumping rope is considered a \\n     vigorous-intensity activity.\\n\\n  - It is an excellent exercise for \n     elevating your heart rate and \n     burning calories.\n  -Improves Overall Mental \n     Health.\n") // get the selected exercise
                intent = Intent(this, DetailActivityOfExercises::class.java)
                intent.putExtra("exercise",exercise)
                startActivity(intent)
//                intent = Intent(this,DetailActivityOfExercises::class.java)
//                intent.putExtra("hame","")
//                startActivity(intent)

//                startActivity(Intent(this, Exercise_details_three::class.java))
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

                }
            3 -> {
                val exercise = ExerciseDet("Burpees",R.drawable.burpeesexercise,"  \n   BENEFITS:-\n - Burn fat while building muscle.\n - improve your strength, \n     endurance, general fitness, and \n     boost your weight loss \n  - A standard burpee exercise \n     works to strengthen the \n     muscles in your legs, hips, \n     buttocks, abdomen, arms, \n     chest, and shoulders.\n") // get the selected exercise
                intent = Intent(this, DetailActivityOfExercises::class.java)
                intent.putExtra("exercise",exercise)
                startActivity(intent)

//               startActivity(Intent(this, Exercise_details_four::class.java))
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
//
                }
            4 -> {

                val exercise = ExerciseDet("PushUps ",R.drawable.pushup,"\n   BENEFITS:-\n  -Improves Body Alignment and \n   Helps Avoid Illness.\n  -Build Core Strength.\n -Improves Flexibility.\\n\\n  - Improves Metabolism.\n  -Improves Overall Mental \n     Health.\n") // get the selected exercise
                intent = Intent(this, DetailActivityOfExercises::class.java)
                intent.putExtra("exercise",exercise)
                startActivity(intent)
//                startActivity(Intent(this, Exercise_details_five::class.java))
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

                }
            5 -> {
                val exercise = ExerciseDet("Cunches",R.drawable.crunchess,"helps to reduce weight") // get the selected exercise
                intent = Intent(this, DetailActivityOfExercises::class.java)
                intent.putExtra("exercise",exercise)
                startActivity(intent)

//                startActivity(Intent(this, Exercise_details_six::class.java))
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)


                }
            6 ->{
                val exercise = ExerciseDet("IntermittenPlan",R.drawable.burpeesexercise,"helps to reduce weight") // get the selected exercise
                intent = Intent(this, DetailActivityOfExercises::class.java)
                intent.putExtra("exercise",exercise)
                startActivity(intent)

//                startActivity(Intent(this,IntermittentPlan::class.java))
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

               }
        }
    }


}