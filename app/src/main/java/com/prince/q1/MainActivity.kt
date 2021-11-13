package com.prince.q1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnSignup : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignup = findViewById( R.id.btnSignup )

        btnSignup.setOnClickListener(){
            val intent = Intent( this@MainActivity , signUp::class.java )
            startActivity( intent )

        }

    }
}