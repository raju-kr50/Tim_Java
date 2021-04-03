package com.controlFlowStatements;

public class NumberToWords {

    public static void main(String[] args) {

    }

    public static String numberToWords(int number) {
        reverse(number);
        String word="";
        if (number < 0) {
            word= "Invalid Value";
        }
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            switch (digit) {
                case 0:
                    word= "Zero";
                    break;
                case 1:
                    word="One";
                    break;
                case 2:
                    word="Two";
                    break;
                case 3:
                    word="Three";
                    break;
                case 4:
                    word="Four";
                    break;
                case 5:
                    word="Five";
                    break;
                case 6:
                    word="Six";
                    break;
                case 7:
                    word="Seven";
                    break;
                case 8:
                    word="Eight";
                    break;
                case 9:
                    word="Nine";
                    break;
                default:
                    word="Invalid value";
            }
        }
        return word;
    }

    public static int reverse(int number){
         int reversedNumber=0;
         while(number!=0){
             reversedNumber=reversedNumber*10 + number%10;
             number/=10;
         }
         return reversedNumber;
    }

//    public static int getDigitCount(int number){
//        if (number<0){
//            return -1;
//        }
//    }
}
