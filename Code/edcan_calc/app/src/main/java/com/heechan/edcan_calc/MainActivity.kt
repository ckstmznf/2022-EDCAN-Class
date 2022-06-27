package com.heechan.edcan_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputFirstNum : EditText = findViewById(R.id.edt_main_firstNum)
        val inputSecondNum : EditText = findViewById(R.id.edt_main_secondNum)
        val txtResult = findViewById<TextView>(R.id.txt_main_result)
        val btnCalc = findViewById<Button>(R.id.btn_main_calc)

        btnCalc.setOnClickListener {
            val num1 = inputFirstNum.text.toString().toInt()
            val num2 = inputSecondNum.text.toString().toInt()
            val resultNum = num1 + num2

            txtResult.text = resultNum.toString()
        }
    }
}