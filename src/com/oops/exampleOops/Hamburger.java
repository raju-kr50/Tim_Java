package com.oops.exampleOops;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        int countAdditionalItem = 0;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with "+this.meat +", price is "+this.price);
        if (this.addition1Name != null && countAdditionalItem<5) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
            countAdditionalItem++;
        }
        if (this.addition2Name != null && countAdditionalItem<5) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
            countAdditionalItem++;
        }
        if (this.addition3Name != null && countAdditionalItem<5) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
            countAdditionalItem++;
        }
        if (this.addition4Name != null && countAdditionalItem<5) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
            countAdditionalItem++;
        }
        System.out.println("Total amount = " + hamburgerPrice);
        return hamburgerPrice;

    }

    public double totalPrice(boolean lettuce, boolean tomato, boolean carrot, boolean mushrooms) {
        double totalPrice = this.price;
        double lettucePrice = 10.0;
        double tomatoPrice = 10.0;
        double carrotPrice = 10.0;
        double mushroomsPrice = 10.0;

        System.out.println("Base Price " + this.price);
        if (lettuce) {
            totalPrice += lettucePrice;
            System.out.println("Additional lettuce = " + lettucePrice);
        }
        if (tomato) {
            totalPrice += tomatoPrice;
            System.out.println("Additional tomato = " + tomatoPrice);
        }
        if (carrot) {
            totalPrice += carrotPrice;
            System.out.println("Additional carrot = " + carrotPrice);
        }
        if (mushrooms) {
            totalPrice += mushroomsPrice;
            System.out.println("Additional mushrooms = " + mushroomsPrice);
        }
        return totalPrice;
    }

}
