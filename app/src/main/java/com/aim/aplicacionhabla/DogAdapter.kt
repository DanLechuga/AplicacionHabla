package com.aim.aplicacionhabla

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(val imaneges: List<String>):RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog,parent,false))
    }

    override fun getItemCount(): Int  = imaneges.size


    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item : String = imaneges[position]
        holder.bind(item)
    }
}