package com.example.fizzbuzz.presentation.second_screen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fizzbuzz.R

class ItemRVAdapter(
    private val listGame: List<String>
) : RecyclerView.Adapter<ItemRVAdapter.ItemViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.rv_item,
            parent, false
        )
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        holder.idTextview.text = listGame[position]

    }

    override fun getItemCount(): Int {
        return listGame.size
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val idTextview: TextView = itemView.findViewById(R.id.idTextview)
    }


}