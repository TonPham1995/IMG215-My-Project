package com.example.myproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)

        }

        button2.setOnClickListener {
            val intent = Intent(this, Main3Activity::class.java)
            startActivity(intent)

        }

        button3.setOnClickListener {
            val intent = Intent(this, Main4Activity::class.java)
            startActivity(intent)

        }

    }
}
