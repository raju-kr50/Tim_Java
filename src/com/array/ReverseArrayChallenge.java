package com.array;

import java.util.Arrays;
import java.util.Scanner;

//        -Write a method called reverse() with an int array as a parameter.
//        -The method should not return any value. In other words, the method is
//         allowed to modify the array parameter.
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//        -To reverse the array, you have to swap the elements, so that the first element is swapped
//         with the last element and so on.
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
public class ReverseArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    private static void reverse(int[] array) {
        int[] inputArray = array.clone();

        int temp = 0;
        int maxIndex = array.length - 1;
        int arrayHalfLength = array.length / 2;

        for (int i = 0; i < arrayHalfLength; i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Array = " + Arrays.toString(inputArray));

        System.out.println("Reversed Array = " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println("Enter how many elements you want in the array: ");
        int numberOfElements = scanner.nextInt();
        int[] elementsArray = new int[numberOfElements];
        System.out.println("Enter " + numberOfElements + " elements in the array: ");

        for (int i = 0; i < numberOfElements; i++) {
            elementsArray[i] = scanner.nextInt();
        }
        reverse(elementsArray);
    }
}
