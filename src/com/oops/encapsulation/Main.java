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


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Jon", 50,"Gun");
        System.out.println("Initial health is "+enhancedPlayer.getHealth());
    }

}
