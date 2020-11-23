package com.codedifferently.tdd.calculator;
import static org.junit.Assert.*;

import com.codedifferently.tdd.calculator.calculator.scientific.SciCalculator;
import org.junit.Assert;
import org.junit.Test;

public class TestSciCalculator {
    @Test
    public void testSin() {
        //Given
        Double input = 0.0;
        Double expected = 0.0;

        //When
        Double actual = SciCalculator.sin(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCos() {
        //Given
        Double input = 0.0;
        Double expected = 1.0;

        //When
        Double actual = SciCalculator.cos(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTan() {
        //Given
        Double input = 4.0;
        Double expected = 5.0;
        //When
        Double actual = SciCalculator.tan(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvSin() {
        //Given
        Double input = 0.0;
        Double expected = 0.0;
        //When
        Double actual = SciCalculator.invSin(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvCos(){
        //Given
        Double input = 1.0;
        Double expected = 0.0;
        //When
        Double actual = SciCalculator.invCos(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvTan(){
        //Given
        Double input = 0.0;
        Double expected = 0.0;
        //When
        Double actual = SciCalculator.invTan(input);
        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testLog() {
        //Given
        Double input = 1.0;
        Double expected = 0.0;
        //When
        Double actual = SciCalculator.log(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

        @Test
        public void testInvLog() {
            //Given
            Double input = 1.0;
            Double expected = 0.0;
            //When
            Double actual = SciCalculator.log(input);
            //Then
            Assert.assertEquals(expected, actual);
        }

    @Test
    public void testNatLog() {
        //Given
        Double input = 10.0;
        Double expected = 1.0;
        //When
        Double actual = SciCalculator.natLog(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvNatLog(){
        //Given
        Double input = 10.0;
        Double expected = 1.0;
        //When
        Double actual = SciCalculator.invNatLog(input);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
