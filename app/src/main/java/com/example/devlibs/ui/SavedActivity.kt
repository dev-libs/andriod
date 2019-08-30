package com.example.devlibs.ui

import android.content.Intent
import android.content.Intent.EXTRA_TEXT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.ColorInt
import com.example.devlibs.R
import com.example.devlibs.ui.GetUserTexts.Companion.KEY_NOUN_ONE
import com.example.devlibs.ui.LastPageActivity.Companion.KEY_16_SENTANCE

import kotlinx.android.synthetic.main.activity_last_page.*
import kotlinx.android.synthetic.main.activity_saved.*

class SavedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved)




        var programTextView = TextView(this)
        programTextView.textSize = 20f


        val savedWord = intent.getStringExtra(LastPageActivity.KEY_16_SENTANCE)



if (savedWord != null) {
        programTextView.text = savedWord
        programTextView.setTextColor(titleColor)
    //        story_text.setText(firstNounText)

    saved_text.setText(story_text.text.toString())



    my_layout.addView(programTextView)
}



    }
}