package com.interfaceExample;

public class Main {

    public static void main(String[] args) {
        ITelephone telephone;
        telephone = new DeskPhone(2136354);

        telephone.powerOn();
        telephone.callPhone(2136354);
        telephone.answer();

        telephone = new MobilePhone(123456);
        telephone.powerOn();
        telephone.callPhone(123456);
        telephone.answer();

    }
}
