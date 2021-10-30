package com.example.testintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestTax {

    // TDD -> Test Driver Development

    //  Development - Test - Development - Test   -> yontem 1

    // Test  - Development - Test - Development - Test -> yontem 2

    private lateinit var tax: Tax

    @Before
    fun setup() {
        tax = Tax()
    }

    @After
    fun teardown() {

    }

    @Test
    fun calculateTaxTest() {
        val netTax = tax.calculateTax(grossIncome = 100.0, taxRate = 0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncomeTest() {
        val incomeTax = tax.calculateIncome(100.0, 0.1)
        assertThat(incomeTax).isEqualTo(90)
    }
}