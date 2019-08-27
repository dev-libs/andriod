package com.example.devlibs.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlibs.R
import kotlinx.android.synthetic.main.activity_last_page.*

class LastPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_page)

        button.setOnClickListener {
            val intent = Intent(this, GetUserTexts::class.java)
            startActivity(intent)
        }
    }
}
