package com.example.feelfit

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feelfit.Adapter.customAdapter3
import com.example.feelfit.GainingExercises.*
import com.example.feelfit.NormalExercise.*


class Exercise_Normal : Fragment(), customAdapter3.MyClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_exercise__normal, container, false)
        val recyclerView3 = view.findViewById<RecyclerView>(R.id.recycler_view3)
        recyclerView3.layoutManager = LinearLayoutManager(requireActivity())

        val data3 = ArrayList<itemview3>()


        data3.add(itemview3(R.drawable.gain1, R.drawable.lung,"LUNGES"))
        data3.add(itemview3(R.drawable.gain2, R.drawable.pull,"PULL-UPS"))
        data3.add(itemview3(R.drawable.gain3, R.drawable.squat,"SQUATS"))
        data3.add(itemview3(R.drawable.gain4, R.drawable.benchpress,"BENCH PRESS"))
        data3.add(itemview3(R.drawable.gain5, R.drawable.pushupss,"PUSHUP"))



        val adapter3 = customAdapter3(data3,this)
        recyclerView3.adapter=adapter3
        recyclerView3.setHasFixedSize(true)

        // Inflate the layout for this fragment
        return view
    }

    override fun onClick(position: Int) {
        when(position)
        {
            0 -> {
                val int= Intent(activity, Normal1::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(int)
            }
            1 -> {
                val int= Intent(activity, Normal2::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(int)
            }

            2 -> {
                val int= Intent(activity, Normal3::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(int)
            }
            3 -> {
                val int= Intent(activity, Normal4::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(int)
            }
            4 -> {
                val int= Intent(activity, Normal5::class.java)
                int.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(int)
            }

        }
    }


}