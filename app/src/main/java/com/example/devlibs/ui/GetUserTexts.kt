package com.example.devlibs.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.devlibs.R
import com.example.devlibs.adapter.EditTextsRecyclerViewAdapter
import com.example.devlibs.models.ListObject
import kotlinx.android.synthetic.main.activity_get_user_texts.*
import kotlinx.android.synthetic.main.edittexts_item.*
import java.util.*

class GetUserTexts : AppCompatActivity() {
    companion object{
        const val KEY_NOUN_ONE = "noun1 "
        const val KEY_NOUN_TWO = "noun 2 "
        const val KEY_NOUN_THREE = "noun 3"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_user_texts)

        list.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.layoutManager = layoutManager
        val dataListAdapter = EditTextsRecyclerViewAdapter(ListObject.devLibsInsertWords, this)
        list.adapter = dataListAdapter

        bttn_set_words.setOnClickListener {
            val intent = Intent(this, LastPageActivity::class.java)
            startActivity(intent)

        }
    }
}
