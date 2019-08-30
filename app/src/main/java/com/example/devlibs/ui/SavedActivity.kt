package com.example.devlibs.ui

import android.content.Intent
import android.content.Intent.EXTRA_TEXT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.ColorInt
import com.example.devlibs.R
import com.example.devlibs.ui.GetUserTexts.Companion.KEY_NOUN_ONE
import com.example.devlibs.ui.LastPageActivity.Companion.KEY_17_SENTANCE
import kotlinx.android.synthetic.main.activity_last_page.*
import kotlinx.android.synthetic.main.activity_saved.*

class SavedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved)




        var programTextView = TextView(this)
        programTextView.textSize = 20f


        val savedWord = intent?.getSerializableExtra(LastPageActivity.KEY_17_SENTANCE)



if (savedWord != null) {
        programTextView.text = savedWord.toString()
        programTextView.setTextColor(titleColor)
    //        story_text.setText(firstNounText)




    my_layout.addView(programTextView)
}
        saved_text.setText(KEY_17_SENTANCE)


        button_back.setOnClickListener {
            val buttonBackIntent = Intent(this, GetUserTexts::class.java)
            startActivity(buttonBackIntent)
        }
    }
}