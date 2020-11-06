package com.company;

public class Adventurer {

    int lifePoints;
    Weapon[] weaponsAdventurer;


    Adventurer() {
        super();
        lifePoints = 200;

        weaponsAdventurer = new Weapon[2];
        weaponsAdventurer[0] = new Sword();
        weaponsAdventurer[1] = new WaterFlask();
    }


    public static void hero() {

    }

    public void enter(Dungeon dungeon) {
        dungeon.runsIntoDungeon(this);
    }

    public void recievedDamage(int damagePoints) {

        lifePoints -= damagePoints;
        if (lifePoints<0){
            System.out.println("R.I.P, you're going to a better place !");

        }

    }
}

