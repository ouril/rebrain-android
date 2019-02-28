package ru.rebrain.gruzdev.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.rebrain.gruzdev.foodapp.screen.splash.SplashActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        startActivity(Intent(this, SplashActivity::class.java))
    }
}
