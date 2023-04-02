package com.example.android.testadd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button:Button = findViewById(R.id.button1)
        val linearLayout: LinearLayout = findViewById(R.id.container)
        button.setOnClickListener(){
            val image :ImageView = ImageView(this)
            val editText: EditText = EditText(this)
            image.setImageResource(R.drawable.ic_launcher_foreground)
            linearLayout.addView(image)
            linearLayout.addView(editText)
            editText.background = null
        }
    }
}