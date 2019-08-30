package com.example.devlibs.ui

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.devlibs.R

import com.example.devlibs.models.ListObject
import com.example.devlibs.models.ListObject.Companion.devLibWords
import com.example.devlibs.models.ListObject.Companion.devLibsInsertWords
import com.example.devlibs.ui.GetUserTexts.Companion.KEY_NOUN_ONE
import com.example.devlibs.ui.GetUserTexts.Companion.KEY_NOUN_THREE
import com.example.devlibs.ui.GetUserTexts.Companion.KEY_NOUN_TWO
import com.example.devlibs.view.AlsCustomView
import com.example.devlibs.view.UserInputFields.Companion.adjective1
import com.example.devlibs.view.UserInputFields.Companion.adjective2
import com.example.devlibs.view.UserInputFields.Companion.adjective3


import com.example.devlibs.view.UserInputFields.Companion.noun1
import com.example.devlibs.view.UserInputFields.Companion.noun2
import com.example.devlibs.view.UserInputFields.Companion.noun3
import com.example.devlibs.view.UserInputFields.Companion.verb1
import com.example.devlibs.view.UserInputFields.Companion.verb2
import com.example.devlibs.view.UserInputFields.Companion.verb3
import kotlinx.android.synthetic.main.activity_last_page.*

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
                    var sevenSen = KEY_7_SENTANCE
                    var eightSen = KEY_8_SENTANCE
                    var nineSen = KEY_9_SENTANCE
                    var tenSen = KEY_10_SENTANCE
                    var elevenSen = KEY_11_SENTANCE
                    var twelveSen = KEY_12_SENTANCE
                    var thirteen = KEY_13_SENTANCE
                    var fourTeen = KEY_14_SENTANCE
                    var fifteen = KEY_15_SENTANCE
                    var sixteen = KEY_16_SENTANCE



        story_text.text = "$introText $noun1. \n $secondSentance $verb1, $thirdSentance $noun2  \n $fourthSentance $adjective1. $fifthSentance $noun3 $sixSen + $noun1" +

              "  \n $sevenSen $noun3. $eightSen  $nineSen $verb3, , $tenSen $noun1. " +
                        " \n $elevenSen $adjective2. $twelveSen $noun2 , $verb2 $thirteen $noun3. " +
                        "\n  $fourTeen $adjective3 \n $fifteen, $adjective1"


        //note that this is just a button intent

        button_tryagain.setOnClickListener {
            val intent = Intent(this, GetUserTexts::class.java)
            startActivity(intent)
        }

        button_save.setOnClickListener {
            val saveIntent = Intent(this, SavedActivity::class.java)

                saveIntent.putExtra( story_text.text.toString(), KEY_17_SENTANCE)

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
