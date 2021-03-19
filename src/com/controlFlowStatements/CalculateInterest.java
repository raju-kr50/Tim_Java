package com.controlFlowStatements;

public class CalculateInterest {

    public static void main(String[] args) {
        for (int interestRate = 2; interestRate <= 8; interestRate++) {
            System.out.println("10,000 at " + interestRate + " interest = " + String.format("%.2f", calculateInterest(10000.0, interestRate)));
        }

        for (int interestRate = 8; interestRate >= 2; interestRate--) {
            System.out.println("10,000 at " + interestRate + " interest = " + String.format("%.2f", calculateInterest(10000.0, interestRate)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
