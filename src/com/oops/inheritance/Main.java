package com.oops.inheritance;

public class Main {

    public static void main(String[] args) {
        Ford ford = new Ford(36);
        ford.steer(75);
        ford.accelerate(30);
        ford.accelerate(15);
        ford.accelerate(-20);

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());


    }
}
