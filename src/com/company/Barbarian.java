package com.company;

public class Barbarian extends Monster {



    public Barbarian() {

        super();
        Weapon weaponMonster = new Axe();
    }

    public void hits(Adventurer adventurer) {
        System.out.println("The barbarbian hits you with an axe");

    }
}
