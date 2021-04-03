package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeExercise1 {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter how many numbers you want to sort in descending order:");
        int numberOfElements = scanner.nextInt();
        int[] inputArray = getIntegers(numberOfElements);

        printArray(inputArray);

        int[] newArray = sortIntegers(inputArray);
        System.out.println("Numbers after sorting: " + Arrays.toString(newArray));

    }

    public static int[] getIntegers(int numberOfElements) {
        int[] numberArray = new int[numberOfElements];
        System.out.println("Enter " + numberOfElements + " numbers to sort in descending order:");
        for (int i = 0; i < numberOfElements; i++) {
            numberArray[i] = scanner.nextInt();
        }
        return numberArray;
    }

    public static void printArray(int[] array) {
        System.out.println("Numbers before sorting: " + Arrays.toString(array));
    }

    public static int[] sortIntegers(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
