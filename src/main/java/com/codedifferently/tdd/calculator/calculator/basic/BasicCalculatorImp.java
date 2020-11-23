package com.codedifferently.tdd.calculator.calculator.basic;

import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;

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
    Double sum= input + memory.recallCurrentValue();
    memory.setCurrentValue(sum);
        return sum;
    }

    protected Double subtract(Double input){
        Double difference= input - memory.recallCurrentValue();
        memory.setCurrentValue(difference);
        return difference;

    }

    protected Double multiply(Double input){
        Double product= input * memory.recallCurrentValue();
        memory.setCurrentValue(product);
        return product;

    }

    protected Double divide(Double input){

        Double divide=  memory.recallCurrentValue()/input;
        memory.setCurrentValue(divide);
        if(input == 0){
            throw new IllegalArgumentException("Argument dividor is 0");
        }
        return divide;
    }

    protected Double sq(Double input){
        Double square=  input * input;
        memory.setCurrentValue(square);
        return square;

    }

    protected Double sqrt(Double input) {

        Double squareRoot=  Math.sqrt(input);
        memory.setCurrentValue(squareRoot);
        return squareRoot;
    }

    protected String helloGreeting(String input){

        return  input;
    }
}
