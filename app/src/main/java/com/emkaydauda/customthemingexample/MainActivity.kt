package com.emkaydauda.customthemingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        getTheme()applyStyle(R.style.OverlayThemeLime, true) in Java
        theme.applyStyle(R.style.OverlayThemeLime, true)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when(view.id) {
            R.id.lime -> {

            }
        }
    }
}
