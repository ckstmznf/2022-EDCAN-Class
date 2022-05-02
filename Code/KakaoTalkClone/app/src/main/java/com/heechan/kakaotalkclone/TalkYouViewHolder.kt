package com.heechan.kakaotalkclone

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class TalkYouViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
    val profileImg : ImageView = view.findViewById(R.id.img_talkYou_profile)
    val writer : TextView = view.findViewById(R.id.txt_talkYou_writer)
    val content : TextView = view.findViewById(R.id.txt_talkYou_content)

    fun onBind(talkData: TalkData) {
        content.text = talkData.content
        writer.text = talkData.writer

        Glide.with(profileImg).load(talkData.profileImg).into(profileImg)
    }
}