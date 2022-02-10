package StrategyPettern.DuckExemple.Fly;

import StrategyPettern.DuckExemple.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm Flying with a rocket");
    }
}
