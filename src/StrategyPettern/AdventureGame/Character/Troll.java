package StrategyPettern.AdventureGame.Character;

import StrategyPettern.AdventureGame.Weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
