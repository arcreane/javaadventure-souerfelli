package com.company;

import java.util.Random;

public class Room {
    Monster monsterType;


    Room() {

        monsterType = new Monster();

        if (Math.random() < 0.5) {
            monsterType = new Barbarian();
        } else {
            monsterType = new Sorcerer();
        }
        //Need to add the monster type
        System.out.println("Behind the door there is "+ "monsterType");
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
