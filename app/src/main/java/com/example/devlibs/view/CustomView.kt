package com.example.devlibs.view

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.example.devlibs.R

class CustomView (context: Context, attrs: AttributeSet?): LinearLayout(context, attrs) {

    constructor(context: Context): this(context, null)

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomView)
        val textWeight = typedArray.getFloat(R.styleable.CustomView_layout_weight, 0f)
        val textSize = typedArray.getDimension(R.styleable.CustomView_textSize, 12f)
        val textLayoutParams = LayoutParams(0, LayoutParams.WRAP_CONTENT, textWeight)
        val textColor = typedArray.getColor(R.styleable.CustomView_text_color, Color.WHITE)
        val backGroundColor = typedArray.getColor(R.styleable.CustomView_background_color, Color.BLACK)
        val textView = LayoutInflater.from(context).inflate(R.layout.custom_view, this, false) as TextView
        textView.text = "Welcome to Dev Libs!" +
                " Fill in the blanks to create a funny story about you!\""
        textView.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        textView.textSize = textSize
        textView.layoutParams = textLayoutParams
        typedArray.recycle()
        textView.setTextColor(textColor)
        setBackgroundColor(backGroundColor)

        orientation = HORIZONTAL
        addView(textView)

    }
}