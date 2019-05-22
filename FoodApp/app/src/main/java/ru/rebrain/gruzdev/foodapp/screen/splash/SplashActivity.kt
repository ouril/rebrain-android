package ru.rebrain.gruzdev.foodapp.screen.splash

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*
import ru.rebrain.gruzdev.foodapp.MainActivity
import ru.rebrain.gruzdev.foodapp.R
import ru.rebrain.gruzdev.foodapp.screen.intro.IntroActivity
import ru.rebrain.gruzdev.foodapp.utils.SharedPrefUtil
import kotlin.coroutines.CoroutineContext

/**
 * It's class for show some pretty when app is loading
 * It's will be show for every time when app start
 */
class SplashActivity : AppCompatActivity(), CoroutineScope {
    override val coroutineContext: CoroutineContext = CoroutineScope(Dispatchers.Default).coroutineContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val sharedPrefUtil = SharedPrefUtil.getInstance(
            getSharedPreferences(
                SharedPrefUtil.PREFERENCE_FILE, Context.MODE_PRIVATE
            )
        )
        launch {
            delay(500)
            startIntroOrMain(sharedPrefUtil)
            finish()
        }
    }

    private fun SplashActivity.startIntroOrMain(sharedPref: SharedPrefUtil) {
        if (sharedPref.isFirstStart()) {
            sharedPref.setFirstStart()
            IntroActivity.start(this@SplashActivity)
        } else {
            MainActivity.start(this@SplashActivity)
        }
    }


}
