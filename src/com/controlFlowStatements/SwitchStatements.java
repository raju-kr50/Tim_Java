package com.controlFlowStatements;

public class SwitchStatements {

    public static void main(String[] args) {
        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actual value is " + switchValue);
                break;
            default:
                System.out.println("No matching value");
                break;
        }
    }
}
