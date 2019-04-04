package com.example.pc.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton:Button = findViewById(R.id.roll_button)
        //rollbutton.text = "Let's Roll"
        rollbutton.setOnClickListener {
            //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResourse = when (randomInt)

    }
}
