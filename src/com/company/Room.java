package com.company;

import java.util.Random;

public class Room {
    Monster monsterType;
    String monstersName;


    Room() {

       monsterType = new Monster();




    }

    public void openTheDoor(Adventurer adventurer) {
        monsterType.hits(adventurer);

    }

    public void monsterAppear()  {


    }
}
