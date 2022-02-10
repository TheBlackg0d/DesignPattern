package StrategyPettern.AdventureGame.Character;

import StrategyPettern.AdventureGame.Weapon.SwordBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }


}
