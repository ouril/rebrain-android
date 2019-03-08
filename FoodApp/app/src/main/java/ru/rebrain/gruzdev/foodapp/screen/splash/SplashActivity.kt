package ru.rebrain.gruzdev.foodapp.screen.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*
import ru.rebrain.gruzdev.foodapp.MainActivity
import ru.rebrain.gruzdev.foodapp.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val scope = CoroutineScope(Dispatchers.Default)
        scope.launch {
            delay(500)
            MainActivity.start(this@SplashActivity)
            finish()
        }
    }
}
