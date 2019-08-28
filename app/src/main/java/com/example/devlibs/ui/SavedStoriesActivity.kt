package com.example.devlibs.ui

import android.app.Activity
import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.devlibs.R
import com.example.devlibs.models.ListObject
import com.example.devlibs.ui.LastPageActivity.Companion.PASSING_STRING
import kotlinx.android.synthetic.main.activity_last_page.*
import kotlinx.android.synthetic.main.activity_saved_stories.*

class SavedStoriesActivity : AppCompatActivity() {
    companion object {

        val PASSING_STRING: String = " "

        val RESULT_INT: Int = 54321

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_stories)



    }
    private fun intentGenerator(myStory: LastPageActivity){
        val intent = Intent(this, LastPageActivity::class.java)

        startActivityForResult(intent, RESULT_INT)
    }

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            if (requestCode == RESULT_INT && resultCode == Activity.RESULT_OK) {
                val myStory: TextView =
                    data?.getSerializableExtra(PASSING_STRING) as TextView
                val programText: TextView = textViewGenerator(myStory)
                activity_saved_stories.addView(programText)
            }
            super.onActivityResult(requestCode, resultCode, data)
        }


    fun textViewGenerator(myStory: TextView): TextView{
        val programTextView: TextView = TextView(this)
        programTextView.textSize = 20f
        programTextView.text = story_text.text


        programTextView.setOnClickListener{
            intentGenerator(myStory = LastPageActivity())
            activity_saved_stories.removeView(it)

        }

        return programTextView
    }

    }







