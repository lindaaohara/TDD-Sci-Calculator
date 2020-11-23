package com.codedifferently.tdd.calculator.calculator.basic;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasicCalculatorImpTest {
    private BasicCalculatorImp basicCalculatorImp;


    @BeforeEach
     public void setUp() {
        basicCalculatorImp = new BasicCalculatorImp();
    }

    @DisplayName("Testing to check add method")
    @Test
    public void testAdd() throws Exception {
        //Given
        basicCalculatorImp.memory.setCurrentValue(5.0);

        //When
        Double expected =8.0;
        Double actual = basicCalculatorImp.;

        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void testSubtract() {

    }

    @Test
    public void testMultiply() {

    }

    @Test
    public void testDivide() {

    }

    @Test
    public void testSq() {

    }

    @Test
    public void testSqrt() {

    }
}