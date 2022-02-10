package StrategyPettern.AdventureGame.Weapon;

public class BowAndArrowBehavior  implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Peircing with a bow and Arrow");
    }
}
