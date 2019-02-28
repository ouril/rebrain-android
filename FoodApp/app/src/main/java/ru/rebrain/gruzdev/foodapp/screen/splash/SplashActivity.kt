package ru.rebrain.gruzdev.foodapp.screen.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import ru.rebrain.gruzdev.foodapp.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        GlobalScope.launch {
            delay(500)
            this@SplashActivity.finish()
        }
    }


}
