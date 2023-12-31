package com.example.thoughtfocus2.ui.splash

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thoughtfocus2.R
import com.example.thoughtfocus2.databinding.ActivitySplashScreenBinding
import com.example.thoughtfocus2.ui.MainActivity

class SplashScreenActivity : AppCompatActivity() {

    lateinit var splashScreenBinding : ActivitySplashScreenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashScreenBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = splashScreenBinding.root
        setContentView(view)

        val videoPath = "android.resource://"+packageName+"/"+R.raw.splashvideo
        val videoUri = Uri.parse(videoPath)

        splashScreenBinding.videoView.setVideoURI(videoUri)
        splashScreenBinding.videoView.start()

        splashScreenBinding.videoView.setOnCompletionListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}