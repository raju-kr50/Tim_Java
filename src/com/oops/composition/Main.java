package com.oops.composition;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case aCase = new Case("220B","Dell", "249", dimensions);

        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27,new Resolution(2540,1440));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus",4,6,"v2.44");

        PC pc = new PC(aCase, monitor, motherBoard);
        pc.getMonitor().drawPixelAt(1500,1200,"Red");
        pc.getMotherBoard().loadProgram("Window 1.0");
        pc.getACase().pressPowerButton();
    }
}
