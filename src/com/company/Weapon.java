package com.company;

public class Weapon {

    int damagePoints;
    String adventurersWeaponName;
    String monstersWeaponName;

    Weapon() {
        damagePoints = 10;

    }

    public void chooseWeapon(String adventurersWeaponName, String monstersWeaponName){
        this.adventurersWeaponName = adventurersWeaponName;
        this.monstersWeaponName = adventurersWeaponName;
    }

}
