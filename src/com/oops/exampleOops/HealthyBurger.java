package com.oops.exampleOops;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    private boolean cheese;
    private boolean cabbage;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
    }

    public void additionExtraItem1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void additionExtraItem2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }

    //    public HealthyBurger(boolean meat, double price, boolean cheese, boolean cabbage) {
//        super("Brown Rye Bread Roll", meat, price);
//        this.cheese = true;
//        this.cabbage = true;
//    }

    @Override
    public double totalPrice(boolean lettuce, boolean tomato, boolean carrot, boolean mushrooms) {
        double totalPrice = super.totalPrice(lettuce, tomato, carrot, mushrooms);
        double cheesePrice = 10.0;
        double cabbagePrice = 10.0;
        if (cabbage) {
            totalPrice += cabbagePrice;
            System.out.println("Additional cabbage = " + cabbagePrice);
        }
        if (cheese) {
            totalPrice += cheesePrice;
            System.out.println("Additional cheese = " + cheesePrice);
        }
        System.out.println("Total price = "+totalPrice);
        return totalPrice;
    }
}
