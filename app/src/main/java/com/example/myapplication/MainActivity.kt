package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("myFunction","onCreate")

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val sendNameButton = findViewById<Button>(R.id.sendNameButton)

        sendNameButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("NAME",name)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("myFunction","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("myFunction","onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("myFunction","onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("myFunction","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("myFunction","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("myFunction","onDestroy")
    }
}