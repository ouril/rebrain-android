package ru.rebrain.gruzdev.foodapp.screen.intro

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.rebrain.gruzdev.foodapp.MainActivity
import ru.rebrain.gruzdev.foodapp.R

/**
 * It's class for show logo and say hello for our customer
 * It's must be show only once
 */
class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, IntroActivity::class.java)
            context.startActivity(intent)
        }
    }
}
