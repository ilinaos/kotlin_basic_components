package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    private lateinit var textView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView2 = findViewById <TextView> (R.id.textView2)

        val data = intent?.getStringExtra(MainActivity.KEY_TEXT)
        textView2.text = data.toString()
        //binding.textView2.text = data?:"hello, world"
    }
}