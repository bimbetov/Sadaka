package com.example.sadaka.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sadaka.model.Needy
import kotlinx.android.synthetic.main.item_view.view.*

class NeedyViewHolder(
     private val view: View
) : RecyclerView.ViewHolder(view){

    fun setInfo(needy: Needy){
        itemView.run {
            fundName.text = needy.getFundName()
            city.text = needy.getCityName()
            needCount.text = needy.getNeededAmount().toString()
            collectedCount.text = needy.getCollectedAmount().toString()

            Glide
                .with(context)
                .load(needy.imageList[0])
                .centerCrop()
                .into(itemPicture)

        }
    }
}