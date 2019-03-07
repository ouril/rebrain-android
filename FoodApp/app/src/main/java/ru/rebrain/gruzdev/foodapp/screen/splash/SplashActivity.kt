package ru.rebrain.gruzdev.foodapp.screen.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import ru.rebrain.gruzdev.foodapp.MainActivity
import ru.rebrain.gruzdev.foodapp.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        runBlocking {
            delay(500)
            finish()
        }
    }

    override fun finish() {

        val intent = Intent(this@SplashActivity, MainActivity::class.java)
        startActivity(intent)
        super.finish()
    }
}
