package StrategyPettern.DuckExemple.Fly;

import StrategyPettern.DuckExemple.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cant Fly Duuuuh !");
    }
}
