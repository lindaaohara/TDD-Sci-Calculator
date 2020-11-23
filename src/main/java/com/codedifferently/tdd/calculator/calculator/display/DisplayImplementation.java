package com.codedifferently.tdd.calculator.calculator.display;

import java.text.DecimalFormat;

public class DisplayImplementation implements Display{
    private DisplayMode displayMode;

    public DisplayImplementation(){
        this.displayMode = DisplayMode.DECIMAL;
    }

    @Override
    public void switchDisplayMode() {

        switch (this.displayMode){
            case OCTAL:
                this.displayMode = DisplayMode.BINARY;
                break;
            case BINARY:
                this.displayMode = DisplayMode.HEXADECIMAL;
                break;
            case DECIMAL:
                this.displayMode = DisplayMode.OCTAL;
                break;
            case HEXADECIMAL:
                this.displayMode = DisplayMode.DECIMAL;
                break;
            default:
                throw new IllegalStateException();
       }
    }

    @Override
    public void switchDisplayMode(String mode){
        this.displayMode = DisplayMode.valueOf(mode);




        this.displayMode = DisplayMode.DECIMAL;
    }



    @Override
    public String getCurrentDisplayMode() {

        return displayMode.name();

    }
}
