package com.example.devlibs.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.devlibs.R
import com.example.devlibs.adapter.EditTextsRecyclerViewAdapter
import com.example.devlibs.model.ListObject.Companion.devLibsInsertWords
import kotlinx.android.synthetic.main.fragment_edittexts_list.*

class InputTextsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_edittexts_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        list.layoutManager = layoutManager
        val dataListAdapter = EditTextsRecyclerViewAdapter(devLibsInsertWords)
        list.adapter = dataListAdapter
    }
}
