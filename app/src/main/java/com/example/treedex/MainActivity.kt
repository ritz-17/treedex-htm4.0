package com.example.treedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed ({
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
            finish()
        },4000)

        val b = AnimationUtils.loadAnimation(this, R.anim.b);
        val imageView = findViewById<ImageView>(R.id.imageView)

    }

}