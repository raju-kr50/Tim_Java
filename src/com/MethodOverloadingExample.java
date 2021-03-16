package com;

public class MethodOverloadingExample {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6,9));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double updatedInches = (feet * 12) + (inches);
            return calcFeetAndInchesToCentimeters(updatedInches);
        } else
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches>=0){
            double centimeters=inches*2.54;
            return centimeters;
        } else
            return -1;
    }

}
