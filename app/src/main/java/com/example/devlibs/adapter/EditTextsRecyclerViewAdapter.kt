package com.example.devlibs.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.devlibs.R
import com.example.devlibs.models.ListObject
import com.example.devlibs.view.UserInputFields.Companion.category
import kotlinx.android.synthetic.main.edittexts_item.view.*


class EditTextsRecyclerViewAdapter(
    private val wordsToUse: List<ListObject>
) : RecyclerView.Adapter<EditTextsRecyclerViewAdapter.ViewHolder>() {

//    makes each item title unique
    private var counter = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        when(counter++){
            0 -> category = "Noun"
            1 -> category = "Verb"
            2 -> category = "Adjective"
        }

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.edittexts_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = wordsToUse.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val wordSet = view.word_set
    }
}
