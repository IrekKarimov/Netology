package com.example.netology1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("NETOLOGY", "onCreate -> start")

        val myText = "Hello, World!"
        val myNumber = 42
        val myFloatingNumber = 3.14

        val myOutputText = "$myText $myNumber $myFloatingNumber"

        Log.e("NETOLOGY", myOutputText)

        val textView = findViewById<TextView>(R.id.text_output)
        textView.text = myOutputText

        Log.d("NETOLOGY", "onCreate -> finish")

    }
}