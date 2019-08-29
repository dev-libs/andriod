package com.example.devlibs.models

class ListObject(typeOfWords: String, val word1: String?, val word2: String?, val word3: String?) {
    val typeOfWords = typeOfWords

    companion object{
        var devLibsInsertWords = mutableListOf(
            ListObject("Noun", "Computer", "Desk", "Keyboard"),
            ListObject("Adjective", "Dark", "Light", "Heavy"),
            ListObject("Verb", "Cloning", "Typing", "Saving")
        )
    }
}