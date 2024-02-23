package com.example.homework21

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.homework21.databinding.MenuElementsBinding

class AdapterPicture : RecyclerView.Adapter<AdapterPicture.PictureViewHolder>() {

    var picList: List<Picture>? = null


    inner class PictureViewHolder(val binding: MenuElementsBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureViewHolder {
        return PictureViewHolder(
            MenuElementsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return picList!!.size
    }

    override fun onBindViewHolder(holder: PictureViewHolder, position: Int) {
        Glide.with(holder.itemView).load(picList?.get(position)!!.pic).into(holder.binding.ivFirstPicture)
        Glide.with(holder.itemView).load(picList?.get(position)!!.pic).into(holder.binding.ivSecondPicture)
        Glide.with(holder.itemView).load(picList?.get(position)!!.pic).into(holder.binding.ivThirdPicture)
    }
}