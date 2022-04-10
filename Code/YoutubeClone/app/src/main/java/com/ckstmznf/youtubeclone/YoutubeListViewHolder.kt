package com.ckstmznf.youtubeclone

import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ckstmznf.youtubeclone.R

class YoutubeListViewHolder(private val row : View) : RecyclerView.ViewHolder(row) {
    val thumbnailImg : ImageView = row.findViewById(R.id.img_youtubeItem_thumbnail)
    val channelImg : ImageView = row.findViewById(R.id.img_youtubeItem_channel)
    val title : TextView = row.findViewById(R.id.txt_youtubeItem_title)
    val channelName : TextView = row.findViewById(R.id.txt_youtubeItem_channelName)
    val viewCount : TextView = row.findViewById(R.id.txt_youtubeItem_viewCount)

    fun onBind(youtubeData : Youtube){
        title.text = youtubeData.title
        channelName.text = youtubeData.channelName
        viewCount.text = "조회수 ${youtubeData.viewCount}회"

        Glide.with(row.context).load(youtubeData.thumbnail).into(thumbnailImg)
        Glide.with(row.context).load(youtubeData.profileImg).into(channelImg)


        row.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(youtubeData.url))
            row.context.startActivity(intent)
        }
    }
}