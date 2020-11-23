package com.codedifferently.tdd.calculator.calculator.display;

import org.junit.Assert;
import org.junit.Test;

public class DisplayImplementationTest {

    private DisplayMode displayMode;


    @Test
    public void switchDisplayModeTest() {
        // : Given
        DisplayImplementation display = new DisplayImplementation();
        String oldDisplayMode = display.getCurrentDisplayMode();

        // : When
        display.switchDisplayMode();

        // : Then
        Assert.assertNotEquals(oldDisplayMode, display.getCurrentDisplayMode());
    }

    @Test
    public void switchDisplayModeWithInputTest() {
        // : Given
        DisplayImplementation display = new DisplayImplementation();
        String expected = DisplayMode.HEXADECIMAL.name();


        // : When
        display.switchDisplayMode(DisplayMode.HEXADECIMAL.name());
        String actual = display.getCurrentDisplayMode();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCurrentDisplayModeTest() {
        // : Given
        DisplayImplementation display = new DisplayImplementation();
        String expected = DisplayMode.DECIMAL.name();

        // : When

        String actual = display.getCurrentDisplayMode();

        // : Then
        Assert.assertEquals(expected, actual);
    }
}