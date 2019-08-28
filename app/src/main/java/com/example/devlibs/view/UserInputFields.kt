package com.example.devlibs.view

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.example.devlibs.R

class UserInputFields(context: Context, attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {

    init {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.UserInputFields)
        val editTextsNumber = typedArray.getInt(R.styleable.UserInputFields_edittexts_number, 3)
        val categoryType = typedArray.getString(R.styleable.UserInputFields_category_type)
        val placeholderWord = typedArray.getString(R.styleable.UserInputFields_placeholder_word)

        val textView = TextView(context)

        textView.text = categoryType?: "Category Not Set"

//        fun inputPlaceholderWord(textEdit: EditText, placeholder: String){
//            textEdit.setText(placeholder, TextView.BufferType.EDITABLE)
//        }

        for (i in 1..editTextsNumber){
            val editTextField = EditText(context)
            editTextField.setText(placeholderWord, TextView.BufferType.EDITABLE)
        }
    }
}