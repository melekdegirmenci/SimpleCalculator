package com.melekdegirmenci.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun mySum(view: View){
        val number1:Int?=editTextNumber.text.toString().toIntOrNull()
        val number2:Int?=editTextNumber2.text.toString().toIntOrNull()
        if(number1==null||number2==null){
            resultText.text="ERROR"
        }else{
        var result =number1+ number2
        resultText.text="Result:${result}"}

    }
    fun mySub(view:View){
        val number1:Int?=editTextNumber.text.toString().toIntOrNull()
        val number2:Int?=editTextNumber2.text.toString().toIntOrNull()
        if(number1==null||number2==null){
            resultText.text="ERROR"
        }else{
        var result =number1-number2
        resultText.text="Result:${result}"}


    }
    fun myMultiply(view:View){
        val number1:Int?=editTextNumber.text.toString().toIntOrNull()
        val number2:Int?=editTextNumber2.text.toString().toIntOrNull()
        if(number1==null||number2==null){
            resultText.text="ERROR"
        }else{
            var result =number1*number2
            resultText.text="Result:${result}"}


    }
    fun myDiv(view:View){
        val number1:Int?=editTextNumber.text.toString().toIntOrNull()
        val number2:Int?=editTextNumber2.text.toString().toIntOrNull()
        if(number1==null||number2==null){
            resultText.text="ERROR"
        }else{
            var result =number1/number2
            resultText.text="Result:${result}"}

    }
}




