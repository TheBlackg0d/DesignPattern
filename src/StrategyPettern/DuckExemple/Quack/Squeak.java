package StrategyPettern.DuckExemple.Quack;

import StrategyPettern.DuckExemple.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(" Squeak Squeak !!");
    }
}
