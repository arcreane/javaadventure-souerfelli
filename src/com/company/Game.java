package com.company;

import java.util.Random;
import java.util.Scanner;

// Creation of all my objects and parameter I need to put in this part

public class Game {


    static public void enterTheDungeon() {
        //Printing the first sentences entering the game
        System.out.println("Here we go Adventurer, are you ready ?");
        System.out.println("Let's enter the dungeon \n");
    }


    public static void game() {

        Adventurer myAdventurer = new Adventurer();
        Dungeon dungeon = new Dungeon();
        myAdventurer.enter(dungeon);

    }
}






