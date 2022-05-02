package com.heechan.kakaotalkclone

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TalkMeViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
    val content : TextView = view.findViewById(R.id.txt_talkMe_content)

    fun onBind(talkData: TalkData) {
        content.text = talkData.content
    }
}