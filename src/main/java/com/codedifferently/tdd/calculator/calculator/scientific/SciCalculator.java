package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import java.lang.Math;

import java.util.ArrayList;
import java.util.List;

public class SciCalculator extends BasicCalculatorImp {

    public SciCalculator() {
        super();
    }
        private static void memory() {
        }

        private static void Display() {

        }

        public void switchUnits(){

        }

        public String switchUnitsMode(){
        // Code?
            return null;
        }

        public static double sin(double a) {
            return Math.sin(a);
        }

        public static double cos(double a){
            return Math.cos(a);
        }

        public static double tan(double a){
            return Math.tan(a);
        }

        public static double invSin(double a){
        return Math.asin(a);
         }

        public static double invCos(double a){
        return Math.acos(a);
        }

        public static double invTan(double a){
        return Math.atan(a);
        }

        public static double log(double a){
        return Math.log(a);
        }

        public static double invLog(double a){
        return Math.pow(Math.log(a), -1);
        }

        public static double natLog(double a){
        return Math.log10(a);
         }

         public static double invNatLog(double a){
         return Math.pow(Math.log10(a), -1);
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

    private static void addTrigMode() {
        List<String> trigOption = new ArrayList<>();
        trigOption.add("Degrees");
        trigOption.add("Radians");
    }

    public static void switchTrigMode() {

        addTrigMode();
    }

    public static String switchTrigMode(String input) {
        List<String> trigOption = new ArrayList<>();
        int idx = trigOption.indexOf(input);

        if(idx < 0 || idx+1 == trigOption.size())
            return "";
        return trigOption.get(idx+1);
    }

    public static void main(String[] args){
        List<String> trigOption = new ArrayList<>();

        trigOption.add("Degrees");
        trigOption.add("Radians");

    }

}
