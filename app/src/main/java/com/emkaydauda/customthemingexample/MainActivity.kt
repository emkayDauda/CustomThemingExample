package com.emkaydauda.customthemingexample

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    val themeKey = "currentTheme"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        getTheme()applyStyle(R.style.OverlayThemeLime, true) in Java
        theme.applyStyle(R.style.OverlayThemeLime, true)
        setContentView(R.layout.activity_main)

        sharedPreferences = getSharedPreferences(
            "ThemePref",
            Context.MODE_PRIVATE
        )

//        val sharedPreferencesEditor = sharedPreferences.edit()
    }

    fun onClick(view: View) {
        when(view.id) {
            R.id.lime -> {
                sharedPreferences.edit().putString(themeKey, "lime").apply()
            }

            R.id.red -> {
                sharedPreferences.edit().putString(themeKey, "red").apply()
            }

            R.id.green-> {
                sharedPreferences.edit().putString(themeKey, "green").apply()
            }

            R.id.blue -> {
                sharedPreferences.edit().putString(themeKey, "blue").apply()
            }

        }

        startActivity(intent)
    }

}
