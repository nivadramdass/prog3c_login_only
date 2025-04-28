package com.example.login_prog3c

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// ✅ Must be public and top-level
class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next) // Layout must exist
    }
}
