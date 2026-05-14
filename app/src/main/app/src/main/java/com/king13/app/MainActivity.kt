package com.king13.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "KING13"
        text.textSize = 32f
        text.gravity = 17

        setContentView(text)
    }
}
