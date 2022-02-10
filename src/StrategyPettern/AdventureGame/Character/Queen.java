package StrategyPettern.AdventureGame.Character;

import StrategyPettern.AdventureGame.Weapon.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
