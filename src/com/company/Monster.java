package com.company;

public class Monster {

    Weapon myWeapon;


    Monster() {
        myWeapon = new Weapon();


    }




    public void hits(Adventurer adventurer) {
        adventurer.recievedDamage(myWeapon.damagePoints);

    }
}



