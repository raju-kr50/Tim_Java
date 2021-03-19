package com.controlFlowStatements;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInAMonth(1, 2020));
        System.out.println(getDaysInAMonth(2, 2020));
        System.out.println(getDaysInAMonth(2, 2018));
        System.out.println(getDaysInAMonth(-1, 2020));
        System.out.println(getDaysInAMonth(1, -2020));

    }

    //      Checking if year is a Leap Year
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else
                return false;
        } else
            return false;
    }

    //        First way to get number of days - Advanced switch
    public static int getDaysInMonth(int month, int year) {
        int numberOfDays = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    numberOfDays = 31;
                }
                case 4, 6, 9 -> {
                    numberOfDays = 30;
                }
                case 2 -> {
                    if (isLeapYear(year)) {
                        numberOfDays = 29;
                    } else
                        numberOfDays = 28;
                }
            }
        }
        return numberOfDays;
    }

    //        Second way to get number of days
    public static int getDaysInAMonth(int month, int year) {
        int numberOfDays = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numberOfDays = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numberOfDays = 30;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        numberOfDays = 29;
                    } else
                        numberOfDays = 28;
                    break;
            }
            return numberOfDays;
        }
    }
}
