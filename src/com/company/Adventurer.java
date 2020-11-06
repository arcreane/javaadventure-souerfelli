package com.company;

public class Adventurer {

    int lifePoints;

    Adventurer() {
        lifePoints = 200;
    }


    public static void hero() {

    }

    public void enter(Dungeon dungeon) {
        dungeon.runsIntoDungeon(this);
    }

    public void recievedDamage(int damagePoints) {
        lifePoints -= damagePoints;
    }
}

