package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1: EditText = findViewById(R.id.num1)
        val num2: EditText = findViewById(R.id.num2)
        val result: TextView = findViewById(R.id.result)
        val add: Button = findViewById(R.id.add)
        val sub: Button = findViewById(R.id.sub)
        val mul: Button = findViewById(R.id.multiply)
        val div: Button = findViewById(R.id.divide)

        add.setOnClickListener{
            result.setText("Addition: ${num1.text.toString().toInt() + num2.text.toString().toInt()}")
        }

        sub.setOnClickListener{
            result.setText("Substraction: ${num1.text.toString().toInt() - num2.text.toString().toInt()}")
        }

        mul.setOnClickListener{
            result.setText("Multiplication: ${num1.text.toString().toInt() * num2.text.toString().toInt()}")
        }

        div.setOnClickListener{
            if(num2.text.toString() == "0"){
                Toast.makeText(this, "Error, Number 2 is 0", Toast.LENGTH_LONG).show()
            }
            else{
                result.setText("Division: ${num1.text.toString().toInt() / num2.text.toString().toInt()}")
            }
        }
    }
}