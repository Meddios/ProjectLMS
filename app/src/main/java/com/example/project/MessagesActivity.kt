package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MessagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)

        val btnMsg = findViewById<TextView>(R.id.messageArd)
        btnMsg.setOnClickListener{
            val intent = Intent(this,chat::class.java)
            startActivity(intent)
            //finish()
        }
    }
}