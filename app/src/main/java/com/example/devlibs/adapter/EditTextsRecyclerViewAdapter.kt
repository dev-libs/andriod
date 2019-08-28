package com.example.devlibs.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.devlibs.R
import com.example.devlibs.models.ListObject

import kotlinx.android.synthetic.main.edittexts_item.view.*


class EditTextsRecyclerViewAdapter(
    private val wordsToUse: List<ListObject>
) : RecyclerView.Adapter<EditTextsRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.edittexts_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = wordsToUse[position]
        holder.wordType.text = item.typeOfWords
        holder.word1.setText(item.word1, TextView.BufferType.EDITABLE)
        holder.word2.setText(item.word2, TextView.BufferType.EDITABLE)
        holder.word3.setText(item.word3, TextView.BufferType.EDITABLE)

        //On text change listener
//        change theme programmatically
//        LinearLayout custom view edittexts_item.xml
        //use material.io editTexts


    }

    override fun getItemCount(): Int = wordsToUse.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val wordType: TextView = view.word_type
        val word1: EditText = view.edittext1
        val word2: EditText = view.edittext2
        val word3: EditText = view.edittext3
    }
}
