package StrategyPettern.AdventureGame;

import StrategyPettern.AdventureGame.Character.*;
import StrategyPettern.AdventureGame.Character.Character;
import StrategyPettern.AdventureGame.Weapon.BowAndArrowBehavior;

public class AdventureGame {
    public static void main(String[] args) {
        Character c = new King();

        c.fight();

        c.setWeaponBehavior(new BowAndArrowBehavior());
        c.fight();
    }
}
