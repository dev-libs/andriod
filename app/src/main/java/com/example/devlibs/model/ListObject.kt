package com.example.devlibs.model

class ListObject(typeOfWords: String) {
    val typeOfWords = typeOfWords

    companion object{
        var devLibsInsertWords = mutableListOf<ListObject>()
    }
}