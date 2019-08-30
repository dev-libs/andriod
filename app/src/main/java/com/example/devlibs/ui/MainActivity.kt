package com.example.devlibs.ui

import android.content.Intent
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.view.postDelayed
import com.example.devlibs.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {
            val intent = Intent(this, GetUserTexts::class.java)

            animateVectorDrawable(R.drawable.avd_loading,animated_image)

            Thread(Runnable {
            Thread.sleep(2000)
            runOnUiThread { startActivity(intent) }
            }).start()
        }

        button_register.setOnClickListener {
            val registerIntent = Intent(this,Register::class.java)
            startActivity(registerIntent)
        }
    }

    private fun animateVectorDrawable(id: Int, view: ImageView){
        val animatedVector = ContextCompat.getDrawable(this, R.drawable.avd_loading)
        view.setImageDrawable(animatedVector)
        (animatedVector as Animatable).start()
    }

}
