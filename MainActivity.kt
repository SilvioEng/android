package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to activity_main.xml layout
        setContentView(R.layout.activity_main)
        
        // Find the TextView by its ID and set its text
        val textView: TextView = findViewById(R.id.helloTextView)
        textView.text = "Hello, World!"
    }
}
