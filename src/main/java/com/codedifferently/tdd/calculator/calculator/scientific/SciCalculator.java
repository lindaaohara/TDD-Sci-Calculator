package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;

import java.util.ArrayList;
import java.util.List;

public class SciCalculator extends BasicCalculatorImp {

    public SciCalculator(){
        super();
        /**
         * Add your constructor code here
         */
    }

    public static Double sine(Double input) {
        Double sin = Math.sin((Double) input);
        return sin;
    }

    public static Double cosine(Double input) {
        Double cos = Math.cos((Double) input);
        return cos;
    }

    public static Double tangent(Double input) {
        Double tan = Math.tan((Double) input);
        return tan;
    }

    public static Double invSine(Double input) {
        Double invSin = Math.asin((Double) input);
        return invSin;
    }

    public static Double invCosine(Double input) {
        Double invCos = Math.acos((Double) input);
        return invCos;
    }

    public static Double invTangent(Double input) {
        Double invTan = Math.atan((Double) input);
        return invTan;
    }

    public static Double log(Double input) {
        Double lg = Math.log((Double) input);
        return lg;
    }

    public static Double invLog(Double input) {
        Double e = Math.pow(Math.E, Math.log((Double) input));
        return e;
    }

    public static Double natLog(Double input) {
        Double ln = Math.log10((Double) input);
        return ln;
    }

    public static Double invNatLog(Double input) {
        Double invln = Math.pow(10, (Double) input);
        return invln;
    }

    //public static void switchTrigMode() {
    //    List<String> trigOption = new ArrayList<>();
    //    trigOption.add("Degrees");
    //    trigOption.add("Radians");
    //}

    public static String switchTrigMode(String input) {
        String mode = input;
        return mode;
    }
}
