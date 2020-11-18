package com.codedifferently.tdd.calculator.calculator.memory;

public class MemoryImplementation implements Memory{
    private Double currentValue;


    public MemoryImplementation(){

        this.currentValue = 0.0;
    }

    @Override
    public void addToCurrentValue(Double input) {
        currentValue +=input;
    }

    @Override
    public void resetMemory() {
        currentValue=0.0;
    }

    @Override
    public Double recallCurrentValue() {

        return currentValue;
    }
}
