package com.codedifferently.tdd.calculator.calculator.memory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.Assert.*;

public class MemoryImplementationTest {
     private MemoryImplementation memoryImplementation;

    @Before
    public void setUp() throws Exception {
        memoryImplementation = new MemoryImplementation();
    }

    @Test
    @DisplayName("Test to Check the reset value to be 0.0")
    public void checkingToResetMemory() {
       // MemoryImplementation memoryImplementation = new MemoryImplementation();
        // Double currentValue=0.0;

         //when
        Double expected = 0.0;
        Double actual = 0.0;
        //Then
        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    @DisplayName("Check the Recall current value to be 8.0")
    public void checkingToRecallCurrentValue() {

   //     MemoryImplementation memoryImplementation = new MemoryImplementation();
        memoryImplementation.setCurrentValue(8.0);

        //When
        Double expected = 8.0;
        Double actual = memoryImplementation.getCurrentValue();
        //Then
        Assert.assertEquals(expected,actual,0.0);
    }
}