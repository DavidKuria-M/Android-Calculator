package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    private val result:Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var solution:TextView = findViewById(R.id.tv_solution)
        //var result:TextView =  findViewById(R.id.tv_results)
        var clear:Button =  findViewById(R.id.btn_clear)
        var openBracket:Button = findViewById(R.id.btn_openbraket)
        var closedBracket:Button = findViewById(R.id.btn_closingbracket)
        var divide:Button = findViewById(R.id.btn_divide)
        var multiply:Button = findViewById(R.id.btn_multiplication)
        var addition:Button = findViewById(R.id.btn_add)
        var minus:Button = findViewById(R.id.btn_minus)
        var equals:Button = findViewById(R.id.btn_equals)
        var decimal:Button = findViewById(R.id.btn_decimal)
        var percentage:Button = findViewById(R.id.btn_percentage)

        var zero:Button = findViewById(R.id.btn_zero)
        var one:Button = findViewById(R.id.btn_1)
        var two: Button = findViewById(R.id.btn_2)
        var three: Button = findViewById(R.id.btn_3)
        var four: Button = findViewById(R.id.btn_4)
        var five: Button = findViewById(R.id.btn_5)
        var six: Button = findViewById(R.id.btn_6)
        var seven: Button = findViewById(R.id.btn_7)
        var eight: Button = findViewById(R.id.btn_8)
        var nine: Button = findViewById(R.id.btn_9)


        zero.setOnClickListener {
            var zeros = 0
        }
        one.setOnClickListener {
            var ones = 1
        }
        two.setOnClickListener {
            var twos = 2
        }
        three.setOnClickListener {
            var threes = 3
        }
        four.setOnClickListener {
            var fours = 4
        }
        five.setOnClickListener {
            var fives = 5
        }
        six.setOnClickListener {
            var sixes = 6
        }
        seven.setOnClickListener {
            var sevens = 7
        }
        eight.setOnClickListener {
            var eights = 8
        }
        nine.setOnClickListener {
            var nines = 9

        }



    }
}