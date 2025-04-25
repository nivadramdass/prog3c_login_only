package com.example.login_prog3c

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up) // we'll create this layout next


        val signUpButton = findViewById<Button>(R.id.signUpButton)


        signUpButton.setOnClickListener {
            val intent = Intent(this, RegisterValidActivity::class.java)
            startActivity(intent)
            finish()
        }


    }


}


