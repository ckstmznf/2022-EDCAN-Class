package com.heechan.kakaotalkclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val talkDataList = mutableListOf<TalkData>(
            TalkData("박희찬", "Hello World", "https://i.imgur.com/bMel0Ho.jpg"),
            TalkData("박희찬", "안녕 인수야", "https://i.imgur.com/bMel0Ho.jpg"),
            TalkData("장인수", "저는 장인수 입니다 1", "https://i.imgur.com/GbzdfiJ.png"),
            TalkData("박희찬", "그래 인수야", "https://i.imgur.com/bMel0Ho.jpg"),
            TalkData("장인수", "저는 장인수 입니다 2", "https://i.imgur.com/GbzdfiJ.png"),
            TalkData("장인수", "저는 장인수 입니다 3", "https://i.imgur.com/GbzdfiJ.png"),
            TalkData("장인수", "저는 장인수 입니다 4", "https://i.imgur.com/GbzdfiJ.png"),
            TalkData("박희찬", "알겠어 인수야", "https://i.imgur.com/bMel0Ho.jpg"),
            TalkData("장인수", "저는 장인수 입니다 5", "https://i.imgur.com/GbzdfiJ.png"),
            TalkData("박희찬", "죽어라 인수야", "https://i.imgur.com/bMel0Ho.jpg"),
            TalkData("박희찬", "응 인수야", "https://i.imgur.com/bMel0Ho.jpg"),
            TalkData("장인수", "저는 장인수 입니다 6", "https://i.imgur.com/GbzdfiJ.png"),
            TalkData("박희찬", "그래 인수야", "https://i.imgur.com/bMel0Ho.jpg"),
        )

        val adapter = TalkListViewAdapter(talkDataList)
        findViewById<RecyclerView>(R.id.recycler_main_chat).adapter = adapter
    }
}