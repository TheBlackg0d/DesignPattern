package StrategyPettern.DuckExemple.Quack;

import StrategyPettern.DuckExemple.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack !");
    }
}
