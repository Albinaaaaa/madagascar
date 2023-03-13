package com.albina.madagaskar

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter (var animals : ArrayList<Animal>,
                     var context : Context) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    class AnimalViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        var name : TextView = itemView.findViewById(R.id.tv_name)
        var description : TextView = itemView.findViewById(R.id.tv_description)
        var imageView: ImageView = itemView.findViewById(R.id.iv_image)
        var buttonDetails : Button = itemView.findViewById(R.id.button)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_animal,parent,false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.name.text = animals[position].name
        holder.description.text = animals[position].description
        holder.imageView.setImageResource(animals[position].photo)

        holder.buttonDetails.setOnClickListener{
            //Toast.makeText(context, "Love Albina", Toast.LENGTH_SHORT).show()

            var passingName = animals.get(position).name
            var passingDesc = animals.get(position).description

            var intent = Intent(context, DetailsActivity::class.java)

            intent.putExtra("passingName", passingName)
            intent.putExtra("passingDesc", passingDesc)

            context.startActivity(intent)
        }
    }

}