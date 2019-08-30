package com.example.devlibs.view

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.example.devlibs.R

class UserInputFields(context: Context, var attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {

    companion object{
        var noun1 = ""
        var noun2 = ""
        var noun3 = ""
        var verb1 = ""
        var verb2 = ""
        var verb3 = ""
        var adjective1 = ""
        var adjective2 = ""
        var adjective3 = ""
        var category = ""
    }

    init {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.UserInputFields)
        val editTextsNumber = typedArray.getInt(R.styleable.UserInputFields_edittexts_number, 3)
        var categoryType = typedArray.getString(R.styleable.UserInputFields_category_type)
        val placeholderWord = typedArray.getString(R.styleable.UserInputFields_placeholder_word)
        typedArray.recycle()

        categoryType = category
        val textView = TextView(context)
        this.orientation = VERTICAL
        textView.text = categoryType ?: "Category Not Set"
        addView(textView)

        context.theme

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

                    when (categoryType) {
                        "Noun" -> {
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
                        "Verb" -> {
                            when (editTextField.id) {
                                1 -> {
                                    verb1 = word
                                }
                                2 -> {
                                    verb2 = word
                                }
                                3 -> {
                                    verb3 = word
                                }
                            }
                        }
                        "Adjective" -> {
                            when (editTextField.id) {
                                1 -> {
                                    adjective1 = word
                                }
                                2 -> {
                                    adjective2 = word
                                }
                                3 -> {
                                    adjective3 = word
                                }
                            }
                        }
                    }
                }
            })


            addView(editTextField)
        }
    }
}

//when (editTextField.id) {
//    1 -> {
//        noun1 = word
//    }
//    2 -> {
//        noun2 = word
//    }
//    3 -> {
//        noun3 = word
//    }
//}