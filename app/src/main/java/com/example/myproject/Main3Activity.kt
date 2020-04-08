package com.example.myproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        LucianVideoButton.setOnClickListener {
            val intent = YouTubeStandalonePlayer.createVideoIntent(this, PlayerConfig.API_KEY, "KN3OYwP8nHE");
            startActivity(intent);
        }
    }
}
