package com.company;

public class Sorcerer extends Monster {


    public Sorcerer(){
        super();
        Weapon weaponMonster = new LightningOfStrike();
    }

    public void hits(Adventurer adventurer) {
        System.out.println("The sorcerer hits you with a lightning of strike");

    }

}
