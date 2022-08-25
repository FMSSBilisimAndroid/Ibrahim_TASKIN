package com.example.dice_roll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.dice_roll.R.drawable.dice_6
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button= findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)

        button.setOnClickListener{
            rolldice()
        }
    }
    private fun rolldice(){
        val randomInt = Random.nextInt(6)+1
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        textView.text = "Rolled : "+randomInt.toString()
        imageView.setImageResource(drawableResource)
    }
}