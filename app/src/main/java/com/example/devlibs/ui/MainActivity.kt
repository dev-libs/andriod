package com.example.devlibs.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlibs.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {
            val intent = Intent(this, GetUserTexts::class.java)
            startActivity(intent)
        }

        button_register.setOnClickListener {
            val registerIntent = Intent(this,Register::class.java)
            startActivity(registerIntent)
        }
    }
}
