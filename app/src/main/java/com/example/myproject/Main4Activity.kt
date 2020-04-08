package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myproject.PlayerConfig.API_KEY
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        VayneVideoButton.setOnClickListener {
            val intent = YouTubeStandalonePlayer.createVideoIntent(this, API_KEY, "gZDJqpFspmg");
            startActivity(intent);

        }
    }
}
