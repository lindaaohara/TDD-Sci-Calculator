package com.codedifferently.tdd.calculator.calculator.display;

public class DisplayImplementation implements Display{
    private DisplayMode displayMode;

    public DisplayImplementation(){
        this.displayMode = DisplayMode.DECIMAL;
    }

    @Override
    public void switchDisplayMode() {
        this.displayMode = DisplayMode.DECIMAL;
    }

    @Override
    public void switchDisplayMode(String mode) {
    }

    @Override
    public String getCurrentDisplayMode() {

        return null;
    }
}
