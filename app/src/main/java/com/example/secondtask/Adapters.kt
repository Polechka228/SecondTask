package com.example.secondtask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager

class Adapters(
    private val items: List<ItemModel>,
    private val glide: RequestManager,
    private val onItemClick: (Int) -> Unit,
    private val onImageClick: (Int) -> Unit
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fragment_list_item, parent, false)
        return ViewHolder(view, glide, onItemClick, onImageClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bindData(item, position, items.size)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}