package com.ckstmznf.youtubeclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val youtubeData = mutableListOf<Youtube>(
            Youtube(
                title = "토스ㅣSLASH 21 - TDS로 UI 쌓기 : 그 많던 코드는 누가 다 치웠을까?",
                thumbnail = "https://i.ytimg.com/vi/pfKuEuufgdc/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDJJsEgWFMEgvN73OxgRsIvG9zNBA",
                profileImg = "https://yt3.ggpht.com/5R_CRJL68b5KtOTCo7YYW70y99b_nMf1MhrDRSETg83kAsGfWqS7EFahyfXFV2nH_q3XF0RW=s48-c-k-c0x00ffffff-no-rj",
                channelName = "토스",
                viewCount = 12321,
                url = "https://youtu.be/fgSXAKsq-Vo",
            ),
            Youtube(
                title = "토스ㅣSLASH 21 - Micro-frontend React, 점진적으로 도입하기",
                thumbnail = "https://i.ytimg.com/vi/DHPeeEvDbdo/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDbwezuR00Gr3Eysg_fzr7tjKH-Ww",
                profileImg = "https://yt3.ggpht.com/5R_CRJL68b5KtOTCo7YYW70y99b_nMf1MhrDRSETg83kAsGfWqS7EFahyfXFV2nH_q3XF0RW=s48-c-k-c0x00ffffff-no-rj",
                channelName = "토스",
                viewCount = 4324,
                url = "https://youtu.be/fgSXAKsq-Vo",
            ),
            Youtube(
                title = "[PLAYLIST] 둠칫둠칫 내적댄스 폭발하는 노동요 같이듣자 \uD83D\uDE0E",
                thumbnail = "https://i.ytimg.com/vi/yeJSNifQfE0/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAU4C7KnfppzlON6_NHApYWwmXV6A",
                profileImg = "https://yt3.ggpht.com/ytc/AKedOLTNklbh2aKTJZ4eI7H2xT-W_9gSo3AElGF4TGg1xmY=s48-c-k-c0x00ffffff-no-rj",
                channelName = "유디제",
                viewCount = 100,
                url = "https://youtu.be/fgSXAKsq-Vo",
            ),
            Youtube(
                title = "노동요",
                thumbnail = "https://i.ytimg.com/vi/TpPwI_Lo0YY/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAIO9wD709iGqSG7NFhpsojSJLqRw",
                profileImg = "https://yt3.ggpht.com/ytc/AKedOLTqAysYuRvfRNCj5Z9D17o9Tciws45av3dsAugg5w=s48-c-k-c0x00ffffff-no-rj",
                channelName = "sake L",
                viewCount = 100000000,
                url = "https://youtu.be/fgSXAKsq-Vo",
            ),
            Youtube(
                title = "토스ㅣSLASH 21 - 토스 서비스를 구성하는 서버 기술",
                thumbnail = "https://i.ytimg.com/vi/KoLObZ9A3Kc/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDJd95Uv0aDS2yocsZA8R4l1ejmUA",
                profileImg = "https://yt3.ggpht.com/5R_CRJL68b5KtOTCo7YYW70y99b_nMf1MhrDRSETg83kAsGfWqS7EFahyfXFV2nH_q3XF0RW=s48-c-k-c0x00ffffff-no-rj",
                channelName = "토스",
                viewCount = 12123,
                url = "https://youtu.be/fgSXAKsq-Vo",
            ),
            Youtube(
                title = "드르륵 안돼서 분필 부수고 던지는 한석원쌤",
                thumbnail = "https://i.ytimg.com/vi/-Nl9VANUwPc/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDHd21r8ZjY87MfUbTy274NGKv2UA",
                profileImg = "https://yt3.ggpht.com/ps47bsmG85J09I8QO1UlXUrH4vPQafgwfRV_-1VloBOqx7AWwiBxo5Ci0AN2fFz8nvhqPm1U=s48-c-k-c0x00ffffff-no-rj",
                channelName = "초록색연필",
                viewCount = 1523,
                url = "https://youtu.be/fgSXAKsq-Vo",
            ),
            Youtube(
                title = "이세계아이돌 (ISEGYE IDOL) - 리와인드 (RE:WIND) Official MV",
                thumbnail = "https://i.ytimg.com/vi/fgSXAKsq-Vo/hqdefault.jpg?sqp=-oaymwEcCPYBEIoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLD3boZcrgEhpuc6eJ3pUPlql_vOTg",
                profileImg = "https://yt3.ggpht.com/QJdHgfT3P2HhhX4NdjtWYMK5vUNAjOmrKzBahdYOPMm62Qh2v3LaOOh_VW8pZso5TS8-gveo=s48-c-k-c0x00ffffff-no-rj",
                channelName = "왁타버스 WAKTAVERSE",
                viewCount = 1225500,
                url = "https://youtu.be/fgSXAKsq-Vo",
            ),
        )

        findViewById<RecyclerView>(R.id.list_main).apply {
            adapter = YoutubeAdapter(youtubeData)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}