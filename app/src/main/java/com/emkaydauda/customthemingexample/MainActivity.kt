package com.emkaydauda.customthemingexample

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    private val themeKey = "currentTheme"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(
            "ThemePref",
            Context.MODE_PRIVATE
        )

//        getTheme()applyStyle(R.style.OverlayThemeLime, true) in Java
//        theme.applyStyle(R.style.OverlayThemeBlue, true) // -> Replaced
        when (sharedPreferences.getString(themeKey, "red")) {
            "lime" ->  theme.applyStyle(R.style.OverlayThemeLime, true)
            "red" ->  theme.applyStyle(R.style.OverlayThemeRed, true)
            "green" ->  theme.applyStyle(R.style.OverlayThemeGreen, true)
            "blue" ->  theme.applyStyle(R.style.OverlayThemeBlue, true)
        }

        setContentView(R.layout.activity_main)

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

        val intent = intent
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        finish()
        startActivity(intent)

//        recreate()
    }

}
