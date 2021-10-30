package com.example.testintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tax = Tax()
        val netIncome = tax.calculateIncome(grossIncome = 100.0, taxRate = 0.1)
        val netTax = tax.calculateTax(grossIncome = 100.0, taxRate = 0.1)

        println(netIncome)
        println(netTax)
    }
}