package com.array;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[2]=10;
        double[] doubleArray = {1,2,3,4,5};
//        System.out.println(intArray[2]);
//        System.out.println(doubleArray[2]);

        for (int i=0; i<intArray.length; i++){
            intArray[i]= i*10;
//            System.out.println(intArray[i]);
        }

        for (int i=0; i<15; i++){
//            intArray[i]= i*10;
            System.out.println(intArray[i]);
        }
    }
}
