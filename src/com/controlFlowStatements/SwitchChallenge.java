package com.controlFlowStatements;

public class SwitchChallenge {

    public static void main(String[] args) {
        char value = 'B';
        switch (value){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(value+" is present");
                break;
            default:
                System.out.println(value+" is not present");
                break;

        }
    }
}








