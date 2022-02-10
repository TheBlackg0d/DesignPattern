package StrategyPettern.AdventureGame.Character;

import StrategyPettern.AdventureGame.Weapon.WeaponBehavior;

public  abstract class Character {

    protected WeaponBehavior weaponBehavior;
    public Character() {}

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight() {
        weaponBehavior.useWeapon();
    };


}
