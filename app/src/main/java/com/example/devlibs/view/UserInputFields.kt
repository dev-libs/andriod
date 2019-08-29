package com.example.devlibs.view

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.example.devlibs.R


class UserInputFields(context: Context, attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {

    companion object {
        var noun1 = ""
        var noun2 = ""
        var noun3 = ""
    }

    init {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.UserInputFields)
        val editTextsNumber = typedArray.getInt(R.styleable.UserInputFields_edittexts_number, 3)
        val categoryType = typedArray.getString(R.styleable.UserInputFields_category_type)
        val placeholderWord = typedArray.getString(R.styleable.UserInputFields_placeholder_word)
        typedArray.recycle()


        val textView = TextView(context)
        this.orientation = VERTICAL
        textView.text = categoryType ?: "Category Not Set"
        addView(textView)

        for (i in 1..editTextsNumber) {
            val editTextField = EditText(context)
            editTextField.id = i
            editTextField.setText(placeholderWord, TextView.BufferType.EDITABLE)

            editTextField.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    val word = editTextField.text.toString()
                    when (editTextField.id) {
                        1 -> {
                            noun1 = word
                        }
                        2 -> {
                            noun2 = word
                        }
                        3 -> {
                            noun3 = word
                        }
                    }
                }
            })

            addView(editTextField)
        }
    }
}