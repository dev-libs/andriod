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
import kotlinx.android.synthetic.main.edittexts_item.*

class SavedStoriesActivity : AppCompatActivity() {
    companion object {

        val PASSING_STRING: String = " "

        val RESULT_INT: Int = 54321

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_stories)




    }
    private fun intentGenerator(word: ListObject){
        val intent = Intent(this, LastPageActivity::class.java)
        intent.putExtra(GetUserTexts.KEY_NOUN_ONE, edittext1.toString())

        startActivityForResult(intent, RESULT_INT)
    }

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            if (requestCode == RESULT_INT && resultCode == Activity.RESULT_OK) {
                val word1: TextView =
                    data?.getSerializableExtra(GetUserTexts.KEY_NOUN_ONE) as TextView
                val programText: TextView = textViewGenerator(LastPageActivity.toString())
                activity_saved_stories.addView(programText)
            }
            super.onActivityResult(requestCode, resultCode, data)
        }


    fun textViewGenerator(word: String): TextView{
        val programTextView: TextView = TextView(this)
        programTextView.textSize = 20f
        programTextView.text = story_text.text


        programTextView.setOnClickListener{

            activity_saved_stories.removeView(it)

        }

        return programTextView
    }

    }







