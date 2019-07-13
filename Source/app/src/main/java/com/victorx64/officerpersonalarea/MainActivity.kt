package com.victorx64.officerpersonalarea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCenter.start(
            application, "f833d380-645e-4fc6-9a8f-befb4864076f",
            Analytics::class.java, Crashes::class.java
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
