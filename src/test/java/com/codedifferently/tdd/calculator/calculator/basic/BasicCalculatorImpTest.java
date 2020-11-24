package com.codedifferently.tdd.calculator.calculator.basic;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorImpTest {




    @Test
    public void testAdd() throws Exception {
       //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);

        //When
        Double expected = 8.0;
        Double actual = basicCalculatorImp.add(3.0);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testSubtract() throws Exception {
        // Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);

        //When
        Double expected = 3.0;
        Double actual = basicCalculatorImp.subtract(2.0);

        //Then
        Assert.assertEquals(expected,actual, 0.0);
    }

    @Test
    public void testMultiply() throws Exception {
        // Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);

        //When
        Double expected = 10.0;
        Double actual = basicCalculatorImp.multiply(2.0);

        //Then
        Assert.assertEquals(expected,actual, 0.0);
    }

    @Test
    public void testDivide() throws Exception {

        // Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(10.0);

        Double expected = 2.0;
        Double actual = basicCalculatorImp.divide(5.0);

        //Then
       Assert.assertEquals(expected,actual, 0.0);

}

    @Test(expected=IllegalArgumentException.class)
    public void testDivideByZero() throws Exception {

        // Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(10.0);

        Double actual = basicCalculatorImp.divide(0.0);

    }

    @Test
    public void testSquare()  throws Exception {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(0.0);


        //When
        Double expected = 36.0;
        Double actual = basicCalculatorImp.square(6.0);

        //Then
       Assert.assertEquals(expected,actual, 0.0);
    }

    @Test
    public void testRaiseToPower() throws Exception {
       //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(4.0);


        //When
        Double expected = 64.0;
        Double actual = basicCalculatorImp.raiseToPower(3.0);

        //Then
        Assert.assertEquals(expected,actual, 0.0);
    }

    @Test
    public void testSqrt() {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(0.0);

        //When
        Double expected = 6.0;
        Double actual = basicCalculatorImp.sqrt(36.0);

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testInvertSign() {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(0.0);

        //When
        Double expected = -5.0;
        Double actual = basicCalculatorImp.invertSign(5.0);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInverseofDisplay(){
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(0.0);

        //When
        Double expected = .20;
        Double actual = basicCalculatorImp.inverseOfDisplay(5.0);

        //Then
        Assert.assertEquals(expected, actual);

    }
    }
