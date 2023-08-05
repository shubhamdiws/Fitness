package com.example.feelfit

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feelfit.Adapter.customAdapter2
import com.example.feelfit.GainingExercises.*
import com.example.feelfit.LosingExercise.*


class Exercise_Gaining : Fragment(), customAdapter2.MyClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exercise__gaining, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view2)
        recyclerView.layoutManager = LinearLayoutManager(requireActivity())

        val data2 = ArrayList<itemview2>()

        data2.add(itemview2(R.drawable.gain1, R.drawable.lung,"LUNGES"))
        data2.add(itemview2(R.drawable.gain2, R.drawable.pull,"PULL-UPS"))
        data2.add(itemview2(R.drawable.gain3, R.drawable.squat,"SQUATS"))
        data2.add(itemview2(R.drawable.gain4, R.drawable.benchpress,"BENCH PRESS"))
        data2.add(itemview2(R.drawable.gain5, R.drawable.pushupss,"PUSHUP"))
        data2.add(itemview2(R.drawable.gain6, R.drawable.burpees,"GLUTE KICK"))


        val adapter2 = customAdapter2(data2, this)
        recyclerView.adapter=adapter2
        recyclerView.setHasFixedSize(true)


        return view
    }

    override fun onClick(position: Int) {
        when(position)
        {
            0 -> {
                val int= Intent(activity, gaining1::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(int)
            }
            1 -> {
                val int= Intent(activity, gaining2::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(int)
            }

            2 -> {
                val int= Intent(activity, gaining3::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(int)
            }

            3 -> {
                val int= Intent(activity, gaining4::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(int)
            }

            4 -> {
                val int= Intent(activity, gaining5::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(int)
            }

            5 -> {
                val int= Intent(activity, gaining6::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(int)
            }

        }

    }


}