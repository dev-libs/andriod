package com.example.devlibs.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlibs.R
import kotlinx.android.synthetic.main.activity_last_page.*
import kotlinx.android.synthetic.main.story_produce.*

class LastPageActivity : AppCompatActivity() {

    companion object{
        const val KEY_STORY_INTRO = "Once upon time there was this dude by the name of"
        const val KEY_SECOND_SENTANCE = "He was very"
        const val KEY_THIRD_SENTANCE = "and loved doing some random things!"
        const val KEY_FOURTH_SENTANCE = "He had a friend by the name of"
        const val KEY_FINAL_SENTANCE = "And when they did random things together it turned to crazy randomness!"
        const val PASSING_STRING = " "
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_page)

        //TODO 2 that how we place the edittext here

        val firstNoun = intent.getSerializableExtra(GetUserTexts.KEY_NOUN_ONE)
        if (firstNoun != " ") {
            var firstNounText = firstNoun.toString()
    //        story_text.setText(firstNounText)

            val adjective = intent.getSerializableExtra(GetUserTexts.KEY_ADJECTIVE)
            if (adjective != " ") {
                var adjectiveText = adjective.toString()

                val secondNoun = intent.getSerializableExtra(GetUserTexts.KEY_NOUN_TWO)
                if (secondNoun != " ") {
                    var secondNounText = secondNoun.toString()

                            //these are just hard coded strings referred in companions above
                    var introText = KEY_STORY_INTRO
                    var secondSentance = KEY_SECOND_SENTANCE
                    var thirdSentance = KEY_THIRD_SENTANCE
                    var fourthSentance = KEY_FOURTH_SENTANCE
                    var finalSentance = KEY_FINAL_SENTANCE


                    story_text.setText("$introText $firstNounText . \n $secondSentance $adjectiveText , $thirdSentance .  " +
                            "\n $fourthSentance $secondNounText . $finalSentance" )
                }
            }
        }
        //note that this is just a button intent

        button_tryagain.setOnClickListener {
            val intent = Intent(this, GetUserTexts::class.java)
            startActivity(intent)
        }
        button_save.setOnClickListener {
            val saveIntent = Intent()
            saveIntent.putExtra(story_text.toString(), PASSING_STRING)
            setResult(Activity.RESULT_OK, intent)

            finish()

        }
    }
}
