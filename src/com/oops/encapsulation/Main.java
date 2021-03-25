package com.oops.encapsulation;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "John";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Jon", 50, "Gun");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getNumberOfPagesPrinted());
        pagesPrinted = printer.printPage(15);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getNumberOfPagesPrinted());

    }

}
