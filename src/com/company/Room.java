package com.company;

import java.util.Random;

public class Room {
    Monster monsterType;



    Room() {

        monsterType = new Monster();
        if (Math.random() < 0.5) {
            monsterType = new Barbarian();
            System.out.println("The barbarbian hits you with an axe");
        } else {
            monsterType = new Sorcerer();
            System.out.println("The sorcerer hits you with a lightning of strike");
        }
        //Need to add the monster type
        }
    public Monster getMonsterType() {
        return monsterType;

    }

    public void openTheDoor(Adventurer adventurer) {
        monsterType.hits(adventurer);

    }

    public void monsterAppear() {


    }
}
