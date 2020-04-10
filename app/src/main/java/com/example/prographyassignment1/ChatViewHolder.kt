package com.example.prographyassignment1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tv_sender: TextView = itemView.findViewById(R.id.tv_sender)
    //val tv_receiver: TextView = itemView.findViewById(R.id.tv_receiver)

    fun bind(data: ChatData){
        tv_sender.text = data.content
    }
}