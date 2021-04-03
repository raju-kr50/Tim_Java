package com.array;

import java.util.Arrays;

public class ReferenceTypes {

    public static void main(String[] args) {

//        Value Types: Value is copied directly and the variables works independently
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("After change myIntValue = " + myIntValue);
        System.out.println("After change anotherIntValue = " + anotherIntValue);

//        Reference types: Variable is the reference for the object

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[1] = 5;

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherIntArray = " + Arrays.toString(anotherIntArray));

//        De-referencing by creating new Array Object
        anotherIntArray = new int[]{2, 4, 6};
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherIntArray = " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray(int[] array) {
        array[2] = 7;
//        De-referencing by creating new Array Object
        array = new int[]{1, 2, 3, 4, 5};
        System.out.println("After De-referencing = " + Arrays.toString(array));
    }

}
