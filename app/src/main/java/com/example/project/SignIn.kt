package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class SignIn : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        val myEmailForm = findViewById<EditText>(R.id.editTextTextEmailAddress)
        myEmailForm.requestFocus()

        val btnConnect = findViewById<Button>(R.id.btnConnect)
        btnConnect.setOnClickListener{
            val intent = Intent(this,MainSpace::class.java)
            startActivity(intent)
            //finish()
        }

    }

}