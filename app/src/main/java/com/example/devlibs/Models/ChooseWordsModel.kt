package com.example.devlibs.Models

import java.io.Serializable

class ChooseWordsModel (var noun: String, var adjectives: String, var noun2: String):Serializable{

    companion object {

        var wordsList = mutableListOf(ChooseWordsModel)

    }

    }