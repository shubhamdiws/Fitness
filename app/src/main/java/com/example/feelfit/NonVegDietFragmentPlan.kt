package com.example.feelfit

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.*


class NonVegDietFragmentPlan : Fragment() {
    private lateinit var adapter: NonVegRecylerAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_non_veg_diet_plan, container, false)

        val builder= AlertDialog.Builder(requireActivity()).setMessage("Please Wait...").setTitle("Non veg").setIcon(R.drawable.logo)
        val progressBar= ProgressBar(requireActivity())
        progressBar.isIndeterminate=true
        builder.setView(progressBar)
        val dialog=builder.create()
        dialog.show()
        Handler().postDelayed({ // Hide the progress bar
            progressBar.visibility = View.GONE
            Handler().postDelayed({ dialog.dismiss() }, 1000)
        }, 1000)


        recyclerView=view.findViewById<RecyclerView>(R.id.myRecyclerViewfragNonveg)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        // Create the FirebaseRecyclerOptions object
        val ref = FirebaseDatabase.getInstance().getReference("Diet").child("NonVeg")
        val options = FirebaseRecyclerOptions.Builder<NonVegF>()
            .setQuery(ref, NonVegF::class.java)
            .build()
//        options.snapshots.size

//        Log.e("loki", "=Godzilla: ${options.snapshots.size}")
        // Create the adapter

        adapter = NonVegRecylerAdapter(options)
        // Set the adapter to the RecyclerView
        recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()

        return view
    }

    override fun onStart() {
        super.onStart()
        // Start listening for changes to the data
        adapter.startListening()
    }


    override fun onStop() {
        super.onStop()
        // Stop listening for changes to the data
        adapter.stopListening()
    }


}

