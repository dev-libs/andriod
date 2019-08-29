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
}







