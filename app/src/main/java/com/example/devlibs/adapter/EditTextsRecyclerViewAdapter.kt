package com.example.devlibs.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.devlibs.R
import com.example.devlibs.models.ListObject


class EditTextsRecyclerViewAdapter(
    private val wordsToUse: List<ListObject>
) : RecyclerView.Adapter<EditTextsRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.edittexts_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

//        val item = wordsToUse[position]
//        holder.wordType.text = item.typeOfWords

    }

    override fun getItemCount(): Int = wordsToUse.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val wordType: TextView = view.word_type
    }
}
