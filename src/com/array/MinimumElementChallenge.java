package com.array;

import java.util.Scanner;

//    -Write a method called readIntegers() with a parameter called count that represents
//     how many integers the user needs to enter.
//    -The method needs to read from the console until all the numbers are entered,
//     and then return an array containing the numbers entered.
//    -Write a method findMin() with the array as a parameter. The method needs to return the minimum
//     value in the array.
//    -In the main() method read the count from the console and call the method readIntegers()
//     with the count parameter.
//    -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//    -Finally, print the minimum element in the array.
public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        int[] inputNumbers = new int[count];
        System.out.println("Enter the numbers");
        for (int i = 0; i < count; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        return inputNumbers;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Enter count of numbers: ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("Minimum of the numbers is: " + findMin(array));
    }
}