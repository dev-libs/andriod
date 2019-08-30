package com.example.devlibs.ui

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColorInt
import com.example.devlibs.R
import com.example.devlibs.models.ListObject
import com.example.devlibs.models.ListObject.Companion.devLibWords
import com.example.devlibs.models.ListObject.Companion.devLibsInsertWords
import com.example.devlibs.ui.GetUserTexts.Companion.KEY_NOUN_ONE
import com.example.devlibs.ui.GetUserTexts.Companion.KEY_NOUN_THREE
import com.example.devlibs.ui.GetUserTexts.Companion.KEY_NOUN_TWO
import com.example.devlibs.view.AlsCustomView

import com.example.devlibs.view.UserInputFields.Companion.noun1
import com.example.devlibs.view.UserInputFields.Companion.noun2
import com.example.devlibs.view.UserInputFields.Companion.noun3
import kotlinx.android.synthetic.main.activity_last_page.*
import kotlinx.android.synthetic.main.edittexts_item.*

class LastPageActivity : AppCompatActivity() {


    companion object{
        //the main story hardcode
        const val KEY_STORY_INTRO = "Python can be a real"
        const val KEY_SECOND_SENTANCE = "In order to"
        const val KEY_THIRD_SENTANCE = "an app you will need to add"
        const val KEY_FOURTH_SENTANCE = "sets of"
        const val KEY_FIFTH_SENTANCE = " code.  Next you will input a "
        const val KEY_6_SENTANCE ="Finally, be sure to "
        const val KEY_7_SENTANCE = " before you run the "
        const val KEY_8_SENTANCE = " What happens after will "
        const val KEY_9_SENTANCE = "amaze you!  Just "
        const val KEY_10_SENTANCE = " the app and see your "
        const val KEY_11_SENTANCE = "Web design is "
        const val KEY_12_SENTANCE = "! Build a/an "
        const val KEY_13_SENTANCE = " it off to the "
        const val KEY_14_SENTANCE = "JavaScript syntax can be a/an "
        const val KEY_15_SENTANCE = " . Once you learn you will be "
        const val KEY_16_SENTANCE = ""
        const val KEY_17_SENTANCE = ""



        const val PASSING_STRING = " "
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_page)

        val myAnimation = ContextCompat.getDrawable(this, R.drawable.play_again_animation)
        button_tryagain.setImageDrawable(myAnimation)
        (myAnimation as AnimationDrawable).start()

        //TODO 2 that how we place the edittext here

        var introText = KEY_STORY_INTRO
                    var secondSentance = KEY_SECOND_SENTANCE
                    var thirdSentance = KEY_THIRD_SENTANCE
                    var fourthSentance = KEY_FOURTH_SENTANCE
                    var fifthSentance = KEY_FIFTH_SENTANCE
                    var sixSen = KEY_6_SENTANCE

        story_text.text = "$introText $noun1. \n $secondSentance $noun2, $thirdSentance .  " +
                "\n $fourthSentance $noun3. $fifthSentance , $sixSen"

        for (i in 0 until devLibWords.size){
            devLibWords.removeAt(devLibWords.size-1)
        }

//        val noun1 = intent.getSerializableExtra(GetUserTexts.KEY_NOUN_ONE)
//        if (noun1 != " ") {
//            var noun1Text = noun1.toString()
//    //        story_text.setText(firstNounText)
//
//            val noun2 = intent.getSerializableExtra(GetUserTexts.KEY_NOUN_TWO)
//            if (noun2 != " ") {
//                var noun2Text = noun2.toString()
//
//                val noun3 = intent.getSerializableExtra(GetUserTexts.KEY_NOUN_THREE)
//                if (noun3 != " ") {
//                    var noun3Text = noun3.toString()
//
//
//                            //these are just hard coded strings referred in companions above
//                    var introText = KEY_STORY_INTRO
//                    var secondSentance = KEY_SECOND_SENTANCE
//                    var thirdSentance = KEY_THIRD_SENTANCE
//                    var fourthSentance = KEY_FOURTH_SENTANCE
//                    var fifthSentance = KEY_FIFTH_SENTANCE
//
//
//                    // generating the story below
//
//                    story_text.setText("$introText $noun1Text . \n $secondSentance $noun2Text , $thirdSentance .  " +
//                            "\n $fourthSentance $noun3Text . $fifthSentance" )
//                }
//            }
//        }
        //note that this is just a button intent

        button_tryagain.setOnClickListener {
            val intent = Intent(this, GetUserTexts::class.java)
            startActivity(intent)
        }

        button_save.setOnClickListener {
            val saveIntent = Intent(this, SavedActivity::class.java)
//            if(edittext1 != null) {
//                saveIntent.putExtra(KEY_NOUN_ONE, edittext1.text.toString())
//            }
                startActivity(saveIntent)




                finish()
                startActivity(saveIntent)

        }
        button_share.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, story_text.text.toString())
            }
            startActivity(Intent.createChooser(shareIntent, KEY_STORY_INTRO ))
        }
    }
}
