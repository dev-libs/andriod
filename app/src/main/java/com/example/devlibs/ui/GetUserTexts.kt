package com.example.devlibs.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.devlibs.R
import com.example.devlibs.adapter.EditTextsRecyclerViewAdapter
import com.example.devlibs.model.ListObject
import kotlinx.android.synthetic.main.activity_get_user_texts.*

class GetUserTexts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_user_texts)

        list.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.layoutManager = layoutManager
        val dataListAdapter = EditTextsRecyclerViewAdapter(ListObject.devLibsInsertWords)
        list.adapter = dataListAdapter

        bttn_set_words.setOnClickListener {
            //TODO: Replace MainActivity in intent with the LastActivity
            val intent = Intent(this, MainActivity::class.java)


            startActivity(intent)
        }
    }
}
