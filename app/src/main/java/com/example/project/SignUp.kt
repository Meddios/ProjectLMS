package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class SignUp : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val myEmailForm = findViewById<EditText>(R.id.editTextTextEmailAddress)
        myEmailForm.requestFocus()

        val btn_Sign_in = findViewById<Button>(R.id.btnSignIn)
        btn_Sign_in.setOnClickListener{
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        val btn_Connect = findViewById<Button>(R.id.btnConnect)
        btn_Connect.setOnClickListener{
            val intent = Intent(this, Password::class.java)
            startActivity(intent)
        }

        val btn_getCode = findViewById<TextView>(R.id.textView)
        btn_getCode.setOnClickListener{
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }

    }

}