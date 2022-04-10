package com.ckstmznf.youtubeclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ckstmznf.youtubeclone.R

class YoutubeAdapter(val datas : List<Youtube>) : RecyclerView.Adapter<YoutubeListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubeListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_youtube_list_item, parent, false)
        return YoutubeListViewHolder(view)
    }

    override fun onBindViewHolder(holder: YoutubeListViewHolder, position: Int) {
        holder.onBind(datas[position])
    }

    override fun getItemCount(): Int = datas.size
}