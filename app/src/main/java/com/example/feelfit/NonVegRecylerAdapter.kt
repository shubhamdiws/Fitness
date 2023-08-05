package com.example.feelfit

import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions

class NonVegRecylerAdapter(options: FirebaseRecyclerOptions<NonVegF>):FirebaseRecyclerAdapter<NonVegF,NonVegRecylerAdapter.MyViewHolder>(options) {
    inner class MyViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val calorie: TextView = itemView.findViewById(R.id.CalorieNonveg)
        private val img: ImageView =itemView.findViewById(R.id.imageNonVegD)
        private val name: TextView = itemView.findViewById(R.id.nameNonveg)

        fun bind(nonVegF: NonVegF){
            calorie.text=nonVegF.calorie
            name.text=nonVegF.name

            Glide.with(itemView)
                .load(nonVegF.img).placeholder(R.drawable.malee)
                .error(R.drawable.man)
                .listener(object : RequestListener<Drawable> {
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: com.bumptech.glide.request.target.Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {

                        return false
                    }
                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: com.bumptech.glide.request.target.Target<Drawable>?,
                        dataSource: com.bumptech.glide.load.DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        return false
                    }
                })
                .into(img)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_dietnonveg_layout, parent, false)
        Log.e("thor", "bind: $view", )

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int, model: NonVegF) {


        holder.bind(model)


    }
}