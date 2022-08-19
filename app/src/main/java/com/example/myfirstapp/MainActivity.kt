package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //start of my code

        val plusBtn = findViewById<Button>(R.id.pBtn)
        val minusBtn = findViewById<Button>(R.id.mBtn)
        val timesBtn = findViewById<Button>(R.id.tBtn)
        val dvideBtn = findViewById<Button>(R.id.dBtn)

        val resultView = findViewById<TextView>(R.id.textView)

        val firstNum = findViewById<EditText>(R.id.firstNum)
        val secondNum = findViewById<EditText>(R.id.seconfNum)


        plusBtn.setOnClickListener {

          resultView.text= ((firstNum.text.toString().toFloat()) .plus  (secondNum.text.toString().toFloat())).toString()
        }


       minusBtn.setOnClickListener {

            resultView.text= ((firstNum.text.toString().toFloat()) .minus (secondNum.text.toString().toFloat())).toString()
        }
        timesBtn.setOnClickListener {

            resultView.text= ((firstNum.text.toString().toFloat()) * (secondNum.text.toString().toFloat())).toString()
        }
        dvideBtn.setOnClickListener {

            resultView.text= ((firstNum.text.toString().toFloat()) /(secondNum.text.toString().toFloat())).toString()
        }
    }





}