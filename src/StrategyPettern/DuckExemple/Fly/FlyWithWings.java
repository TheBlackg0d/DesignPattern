package StrategyPettern.DuckExemple.Fly;

import StrategyPettern.DuckExemple.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("im Flying with wings !");
    }
}
