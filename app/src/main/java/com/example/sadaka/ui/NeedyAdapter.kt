package com.example.sadaka.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sadaka.R
import com.example.sadaka.model.Needy

class NeedyAdapter(
    private val item: List<Needy>,
    private val clickItemListener :(Needy) -> Unit
) : RecyclerView.Adapter<NeedyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NeedyViewHolder {
        val viewHolder = NeedyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false))
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            if (position != RecyclerView.NO_POSITION){
                clickItemListener(item[position])
            }
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: NeedyViewHolder, position: Int) {
        holder.setInfo(item[position])
    }
}