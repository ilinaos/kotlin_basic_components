package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById <TextView> (R.id.textView)

    }

    companion object {
        val KEY_TEXT = "key"

    }

    fun button_click(view: View){
        val value =textView.text.toString()
        val data = Intent(this, MainActivity2::class.java).apply {
            putExtra(KEY_TEXT, value)
        }
        startActivity(data)

    }
}