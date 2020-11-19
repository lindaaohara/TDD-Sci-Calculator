package com.codedifferently.tdd.calculator.calculator.basic;

import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;
import java.lang.Math;

import static com.codedifferently.tdd.calculator.utils.CustomConsole.*;

public class BasicCalculatorImp implements Calculator{
    protected Memory memory;

    public BasicCalculatorImp(){

        this.memory = new MemoryImplementation();
    }

    public void run(){
        String message = "";
        println("Welcome to TDD Calculator");
        message = String.format("The current Value is %d", memory.recallCurrentValue());
        println(message);
    }


    protected Double add(Double input){
        Double sum = input + memory.recallCurrentValue();
        memory.setCurrentValue(sum);
        return sum;
    }

    protected Double subtract(Double input){
        Double diff = memory.recallCurrentValue()-input;
        memory.setCurrentValue(diff);
        return diff;
    }

    protected Double multiply(Double input){
        Double product = memory.recallCurrentValue() * input;
        memory.setCurrentValue(product);
        return product;
    }

    protected Double divide(Double input) throws IllegalArgumentException{

        Double quot = memory.recallCurrentValue()/input;
        memory.setCurrentValue(quot);
        return quot;
    }

    protected Double sq(Double input){
       Double square = input * input;
       memory.setCurrentValue(square);
        return square;
    }

    protected Double sqrt(Double input) {
        Double root = Math.sqrt(input);
        memory.setCurrentValue(root);
        return root;
    }
}
