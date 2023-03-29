package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<TextView>(R.id.nameTextView).text =
            intent.extras?.getString("NAME","")
        findViewById<TextView>(R.id.ageTextView).text =
            intent.extras?.getInt("AGE",0).toString()
    }
}