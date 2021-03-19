package com.methods;

public class SpeedConverter {
//Main method to call print conversion methods
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

//    Method to convert kilometersPerHour to milePerHour
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            long milePerHour = Math.round(kilometersPerHour / 1.609);
            return milePerHour;
        } else
            return -1;
    }

//    Method to print conversion
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour > 0) {
            long milePerHour =toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+milePerHour+" mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
