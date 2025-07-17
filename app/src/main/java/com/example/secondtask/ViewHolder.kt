package com.example.secondtask

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager

class ViewHolder(
    itemView: View,
    private val requestManager: RequestManager,
    private val onItemClick: (Int) -> Unit,
    private val onImageClick: (Int) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    private val titleTextView = itemView.findViewById<TextView>(R.id.titleText)
    private val descTextView = itemView.findViewById<TextView>(R.id.descriptionText)
    private val numberTextView = itemView.findViewById<TextView>(R.id.number)
    private val imageView = itemView.findViewById<ImageView>(R.id.image)
    private val dividerView = itemView.findViewById<View>(R.id.divider)

    fun bindData(item: ItemModel, pos: Int, total: Int) {
        titleTextView.text = item.title
        descTextView.text = item.description
        numberTextView.text = (pos + 1).toString()
        dividerView.isVisible = pos != total - 1
        requestManager.load(item.getCurrentImageUrl()).into(imageView)

        itemView.setOnClickListener {
            onItemClick(adapterPosition)
        }
        imageView.setOnClickListener {
            onImageClick(adapterPosition)
        }
    }

    fun bindImage(item: ItemModel) {
        requestManager.load(item.getCurrentImageUrl()).into(imageView)
    }
}
