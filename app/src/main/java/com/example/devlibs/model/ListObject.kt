package com.example.devlibs.model

class ListObject(typeOfWords: String, val word1: String?, val word2: String?, val word3: String?) {
    val typeOfWords = typeOfWords

    companion object{
        var devLibsInsertWords = mutableListOf(
            ListObject("Noun", null, null, null),
            ListObject("Noun", null, null, null),
            ListObject("Noun", null, null, null),
            ListObject("Noun", null, null, null)
        )
    }
}