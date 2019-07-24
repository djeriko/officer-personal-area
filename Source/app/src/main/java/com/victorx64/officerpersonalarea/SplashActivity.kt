package com.victorx64.officerpersonalarea

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity()  {
    private val SPLASH_TIME_OUT: Long = 3000  // 3sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach)

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        },SPLASH_TIME_OUT)

    }
}