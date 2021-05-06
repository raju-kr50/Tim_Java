package com;

public class Test {
    public static void main(String[] args) {
        String str1 = "Hello world from java2blog.com";
        String str2 = new String("Hello world from java2blog.com");
        String str3 = "Hello world from java2blog.com";

        if (str1.equals(str2)) {
            System.out.println("1st and 2nd Strings are equal");
        } else {
            System.out.println("1st and 2nd Strings are not equal");
        }

        if (str1.equals(str3)) {
            System.out.println("1st and 3rd Strings are equal");
        } else {
            System.out.println("1st and 3rd Strings are not equal");
        }


    }
}