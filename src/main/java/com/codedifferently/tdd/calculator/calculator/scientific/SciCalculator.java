package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import java.lang.Math;

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


        /**
         * Add your constructor code here
         */

}
