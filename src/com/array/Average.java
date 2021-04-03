package com.array;

import java.util.Scanner;

public class Average {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many numbers you want to calculate average for: ");
        int number = scanner.nextInt();
        System.out.println("Average of entered numbers = " + getAverage(getIntegers(number)));
    }

    public static int[] getIntegers(int number) {
        int[] arrayInput = new int[number];
        System.out.println("Enter " + number + " numbers to get average.");
        for (int i = 0; i < number; i++) {
            arrayInput[i] = scanner.nextInt();
        }
        return arrayInput;
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / (double) array.length;
    }
}
