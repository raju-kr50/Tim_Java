package com.controlFlowStatements;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int newNumber = 0;
        while (number != 0) {
            newNumber = newNumber * 10 + (number % 10);
            number = number / 10;
        }
        if (originalNumber == newNumber) {
            return true;
        } else
            return false;
    }
}
