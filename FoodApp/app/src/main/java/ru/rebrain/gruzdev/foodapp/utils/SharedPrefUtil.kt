package ru.rebrain.gruzdev.foodapp.utils

import android.content.SharedPreferences
import ru.rebrain.gruzdev.foodapp.R

object SharedPrefUtil {
    const val PREFERENCE_FILE = R.string.preference_file_key.toString()

    private const val IS_A_FIRST_TIME = R.string.preference_is_first_time.toString()

    lateinit var sharedPrefInstance: SharedPreferences
    fun getInstance(sharedPref: SharedPreferences): SharedPrefUtil {
        sharedPrefInstance = sharedPref
        return this
    }

    fun isFirstStart(): Boolean = if (sharedPrefInstance.getBoolean(IS_A_FIRST_TIME, true)) {
        with(sharedPrefInstance.edit()) {
            putBoolean(IS_A_FIRST_TIME, false)
            apply()
        }
        true
    } else {
        false
    }


}