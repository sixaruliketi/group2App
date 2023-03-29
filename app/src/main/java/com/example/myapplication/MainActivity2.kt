package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val sendAgeButton = findViewById<Button>(R.id.sendAgeButton)

        val name = intent.extras?.getString("NAME", "")

        sendAgeButton.setOnClickListener {
            val age = ageEditText.text.toString().toInt()
            val intent = Intent(this, MainActivity3::class.java)

            intent.putExtra("NAME",name)
            intent.putExtra("AGE",age)
            startActivity(intent)
        }

    }
}