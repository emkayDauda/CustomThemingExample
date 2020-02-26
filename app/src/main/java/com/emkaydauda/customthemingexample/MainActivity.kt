package com.emkaydauda.customthemingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        getTheme()applyStyle(R.style.OverlayThemeLime, true) in Java
        theme.applyStyle(R.style.OverlayThemeLime, true)
        setContentView(R.layout.activity_main)
    }
}
