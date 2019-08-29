package com.example.devlibs.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.example.devlibs.R
import kotlinx.android.synthetic.main.edittexts_item.view.*

class AlsCustomView : LinearLayout{

    constructor(context: Context?): super(context)
    constructor(context: Context?, attributeSet: AttributeSet?): super(context, attributeSet)
    constructor(context: Context?, attributeSet: AttributeSet?, defStyleAttr: Int): super(context, attributeSet, defStyleAttr)
    constructor(context: Context?, attributeSet: AttributeSet?, defStyleAttr: Int, defStyleRes: Int)
            :super(context, attributeSet, defStyleAttr, defStyleRes)


    //generating random strings

    var historyList = mutableListOf(edittext1?.toString(), edittext2?.toString(), edittext3?.toString())

    //set pointer and go through the list
    var pointer = 0
    fun incPointer(){
        pointer++
        if(pointer >= historyList.size){
            pointer = 0

        }
    }
    fun decPointer(){
        pointer--
        if (pointer < 0){
            pointer = historyList.size -1
        }
    }
    init {

        val generatedTextview = LayoutInflater.from(context)
            .inflate(R.layout.als_custom_view, this, false) as TextView

        orientation = HORIZONTAL

            addView(generatedTextview)
            generatedTextview.text = historyList[pointer]
        }


    }


