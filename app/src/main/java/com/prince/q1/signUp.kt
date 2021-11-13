package com.prince.q1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signUp : AppCompatActivity() {
    lateinit var signIn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signIn = findViewById( R.id.btnLogin )

        signIn.setOnClickListener(){
            val intent = Intent( this@signUp , MainActivity::class.java )
            startActivity( intent )
        }
    }
}