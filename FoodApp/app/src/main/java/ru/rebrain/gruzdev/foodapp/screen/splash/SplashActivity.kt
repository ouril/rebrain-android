package ru.rebrain.gruzdev.foodapp.screen.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*
import ru.rebrain.gruzdev.foodapp.MainActivity
import ru.rebrain.gruzdev.foodapp.R
import kotlin.coroutines.CoroutineContext

class SplashActivity: AppCompatActivity(), CoroutineScope {
    override val coroutineContext: CoroutineContext = CoroutineScope(Dispatchers.Default).coroutineContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        launch {
            delay(500)
            MainActivity.start(this@SplashActivity)
            finish()
        }
    }


}
