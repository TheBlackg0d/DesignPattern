package StrategyPettern.AdventureGame.Character;

import StrategyPettern.AdventureGame.Weapon.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
