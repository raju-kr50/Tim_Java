package com.controlFlowStatements;

public class PrimeNumbers {

    public static void main(String[] args) {
        int numberOfPrime = 0;
        for (int i = 100; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a Prime Number");
                numberOfPrime++;
                if (numberOfPrime == 3) {
                    System.out.println("Exceeding for loop...");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
