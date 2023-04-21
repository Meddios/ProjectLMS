package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        val myPasswordForm = findViewById<EditText>(R.id.editTextTextCreatePassword)
        myPasswordForm.requestFocus()

        val btn_Sign_in = findViewById<Button>(R.id.btnSignIn)
        btn_Sign_in.setOnClickListener{
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        val btn_Connect = findViewById<Button>(R.id.btnConnect)
        btn_Connect.setOnClickListener{
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }
}