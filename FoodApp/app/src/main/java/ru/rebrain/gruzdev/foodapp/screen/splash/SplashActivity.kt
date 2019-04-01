package ru.rebrain.gruzdev.foodapp.screen.splash

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*
import ru.rebrain.gruzdev.foodapp.MainActivity
import ru.rebrain.gruzdev.foodapp.R
import ru.rebrain.gruzdev.foodapp.screen.intro.IntroActivity
import kotlin.coroutines.CoroutineContext

class SplashActivity : AppCompatActivity(), CoroutineScope {
    override val coroutineContext: CoroutineContext = CoroutineScope(Dispatchers.Default).coroutineContext
    val PREFERENCE_FILE = R.string.preference_file_key.toString()
    val IS_A_FIRST_TIME = R.string.preference_is_first_time.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val sharedPref = getSharedPreferences(
            PREFERENCE_FILE, Context.MODE_PRIVATE
        )

        launch {
            delay(500)
            startIntroOrMain(sharedPref)
            finish()
        }
    }

    private fun SplashActivity.startIntroOrMain(sharedPref: SharedPreferences) {
        if (sharedPref.getBoolean(IS_A_FIRST_TIME, true)) {

            with(sharedPref.edit()) {
                putBoolean(IS_A_FIRST_TIME, false)
                apply()
            }
            IntroActivity.start(this@SplashActivity)
        } else MainActivity.start(this@SplashActivity)
    }


}
