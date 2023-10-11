package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DiceRollerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        val button : Button = findViewById(R.id.button_Roll)
        button.setOnClickListener{rollDice()}
    }
    private fun rollDice(){
        val dice1 = Dice(6)
        //val dice2 = Dice(6)

        val diceRoll1 = dice1.lancer()
       // val diceRoll2 = dice2.lancer()

        var diceNumber1: TextView = findViewById(R.id.textV)
        diceNumber1.text = diceRoll1.toString()

        /*var diceNumber2: TextView = findViewById(R.id.textV2)
        diceNumber2.text = diceRoll2.toString()*/

        var img = findViewById<ImageView>(R.id.imageV)
        if (diceNumber1.text == "1") {
            img.setImageResource(R.drawable.dice_1)
        } else if (diceNumber1.text == "2"){
            img.setImageResource(R.drawable.dice_2)
        }else if (diceNumber1.text == "3"){
            img.setImageResource(R.drawable.dice_3)
        }else if (diceNumber1.text == "4"){
            img.setImageResource(R.drawable.dice_4)
        }else if (diceNumber1.text == "5"){
            img.setImageResource(R.drawable.dice_5)
        }else {
            img.setImageResource(R.drawable.dice_6)
        }

    }
}
class Dice (private val faces: Int){
    fun lancer():Int{
        return (1..faces).random()
    }
}