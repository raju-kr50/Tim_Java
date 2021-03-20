package com.controlFlowStatements;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("Sum of digits = " + sumDigits(512));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }
}
