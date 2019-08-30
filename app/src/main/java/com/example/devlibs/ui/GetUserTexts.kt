package com.example.devlibs.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.devlibs.R
import com.example.devlibs.adapter.EditTextsRecyclerViewAdapter
import com.example.devlibs.models.ListObject
import kotlinx.android.synthetic.main.activity_get_user_texts.*

class GetUserTexts : AppCompatActivity() {
    companion object{
        const val KEY_NOUN_ONE = "noun1 "
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_user_texts)

//        Initiates the recyclerView with edittexts_item.xml being the item displayed in activity
        list.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.layoutManager = layoutManager
        val dataListAdapter = EditTextsRecyclerViewAdapter(ListObject.devLibsInsertWords)
        list.adapter = dataListAdapter

//        Starts the next activity
        bttn_set_words.setOnClickListener {
            val intent = Intent(this, LastPageActivity::class.java)
            startActivity(intent)
        }
    }
}
