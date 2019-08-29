package com.example.devlibs.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devlibs.R
import kotlinx.android.synthetic.main.register.*


class Register : AppCompatActivity() {

    companion object{
        const val name = "userName"
        const val pass = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)


        button_confirm_register.setOnClickListener {
            val confirm = Intent(this, MainActivity::class.java)

            startActivity(confirm)
    }
}