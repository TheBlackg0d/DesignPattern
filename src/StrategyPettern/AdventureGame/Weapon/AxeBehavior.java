package StrategyPettern.AdventureGame.Weapon;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Chopping with a axe");
    }
}
