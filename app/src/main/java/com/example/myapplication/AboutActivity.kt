package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
        val change: ImageView = findViewById(R.id.imageView7)

        change.setOnClickListener {
            val intent = Intent(this@AboutActivity, RecordActivity::class.java)
            startActivity(intent)
        }
    }
}