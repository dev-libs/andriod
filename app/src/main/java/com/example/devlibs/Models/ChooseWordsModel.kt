package com.example.devlibs.Models

import java.io.Serializable

class ChooseWordsModel (var nounOne: String, var nounTwo: String, var adjective: String, var verb: String, var nounThree: String):Serializable{

    companion object {

        var wordsList = mutableListOf(ChooseWordsModel)

    }

    }