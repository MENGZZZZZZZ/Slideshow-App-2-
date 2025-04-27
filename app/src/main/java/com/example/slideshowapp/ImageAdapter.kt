package com.example.slideshowapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val items: List<ImageItem>) :
    RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.itemImageView)
        val captionView: TextView = itemView.findViewById(R.id.itemCaptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.image_list_item, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val item = items[position]
        holder.imageView.setImageResource(item.imageResId)
        holder.captionView.text = item.caption
    }

    override fun getItemCount(): Int = items.size
}
