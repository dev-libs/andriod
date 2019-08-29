package com.example.devlibs.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.devlibs.R
import com.example.devlibs.ui.GetUserTexts.Companion.KEY_NOUN_ONE
import kotlinx.android.synthetic.main.activity_saved.*

class SavedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved)

        var programTextView = TextView(this)
        programTextView.textSize = 20f
        programTextView.text = KEY_NOUN_ONE

        val savedWord = intent.getSerializableExtra(GetUserTexts.KEY_NOUN_ONE)
        if (savedWord != " ") {
            var savedWordText = programTextView
            //        story_text.setText(firstNounText)

            my_layout.addView(savedWordText)
        }

    }
}