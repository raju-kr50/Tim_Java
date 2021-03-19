package com.methods;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
//        decimalFormat.setMaximumFractionDigits(3); Another way to limit decimal places
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        double newFirst = Double.valueOf(decimalFormat.format(first));
        double newSecond = Double.valueOf(decimalFormat.format(second));
        if (newFirst==newSecond) {
            return true;
        } else
            return false;
    }


}
