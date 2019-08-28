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
import kotlinx.android.synthetic.main.edittexts_item.*

class GetUserTexts : AppCompatActivity() {
    companion object{
        const val KEY_NOUN_ONE = "my string "
        const val KEY_ADJECTIVE = "my adjective "
        const val KEY_NOUN_TWO = "my second string"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_user_texts)

        list.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        list.layoutManager = layoutManager
        val dataListAdapter = EditTextsRecyclerViewAdapter(ListObject.devLibsInsertWords)
        list.adapter = dataListAdapter

        bttn_set_words.setOnClickListener {
            val intent = Intent(this, LastPageActivity::class.java)

            //TODO 1 ! grabbing our editText and passing them into our story (using `key`(companion value)):

            intent.putExtra(KEY_NOUN_ONE, edittext1.text.toString())
            intent.putExtra(KEY_ADJECTIVE, edittext2.text.toString())
            intent.putExtra(KEY_NOUN_TWO, edittext3.text.toString())
            startActivity(intent)
        }
    }
}
