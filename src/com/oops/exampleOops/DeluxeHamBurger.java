package com.oops.exampleOops;

public class DeluxeHamBurger extends Hamburger {

    private String deluxeAdditionalItem1Name;
    private double deluxeAdditionalItem1Price;
    private double deluxeAdditionalItem2Price;
    private String deluxeAdditionalItem2Name;

    public DeluxeHamBurger() {
        super("Deluxe", "White", "Sausage & Bacon", 20);
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        int countItem = 0;
        if (countItem < 3) {
            if (this.deluxeAdditionalItem1Name != null) {
                hamburgerPrice += this.deluxeAdditionalItem1Price;
                System.out.println("Added " + this.deluxeAdditionalItem1Name + " for an extra " + this.deluxeAdditionalItem1Price);
            }

            if (this.deluxeAdditionalItem2Name != null) {
                hamburgerPrice += this.deluxeAdditionalItem2Price;
                System.out.println("Added " + this.deluxeAdditionalItem2Name + " for an extra " + this.deluxeAdditionalItem2Price);
            }
        } else {
            System.out.println("Cannot add this additional item");
        }
        return hamburgerPrice;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot add this additional item");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot add this additional item");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot add this additional item");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot add this additional item");
    }
}
