package com.oops.inheritance;

public class Main {

    public static void main(String[] args) {
        Ford ford = new Ford(36);
        ford.steer(75);
        ford.accelerate(30);
        ford.accelerate(15);
        ford.accelerate(-20);
    }
}
