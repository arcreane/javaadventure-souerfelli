package com.company;

public class Dungeon {

    Room[] rooms;

    public Dungeon() {
        rooms = new Room[5]; // Array that can contain 5 rooms created in the dungeon
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
            System.out.println("Welcome to room "+(i+1));
        }

    }

    public void runsIntoDungeon(Adventurer adventurer) {
        for (int i = 0; i < rooms.length; i++) {

            rooms[i].openTheDoor(adventurer);

        }
    }
}
