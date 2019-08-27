package com.example.devlibs.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.devlibs.R
import com.example.devlibs.model.ListObject

import kotlinx.android.synthetic.main.fragment_edittexts.view.*


class EditTextsRecyclerViewAdapter(
    private val mValues: List<ListObject>
) : RecyclerView.Adapter<EditTextsRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_edittexts, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.text.text = item.typeOfWords

    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val text = view.content
    }
}
