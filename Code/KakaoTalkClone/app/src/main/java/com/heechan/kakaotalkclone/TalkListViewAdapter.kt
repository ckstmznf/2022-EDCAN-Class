package com.heechan.kakaotalkclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TalkListViewAdapter(val talkDataList : MutableList<TalkData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if(viewType == 1) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_talk_me, parent, false)
            TalkMeViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_talk_you, parent, false)
            TalkYouViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is TalkMeViewHolder) (holder as TalkMeViewHolder).onBind(talkDataList[position])
        else (holder as TalkYouViewHolder).onBind(talkDataList[position])
    }

    override fun getItemCount(): Int = talkDataList.size

    override fun getItemViewType(position: Int): Int {
        return if(talkDataList[position].writer == "박희찬") 1 else 2
    }
}