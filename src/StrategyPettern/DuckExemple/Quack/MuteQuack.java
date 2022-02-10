package StrategyPettern.DuckExemple.Quack;

import StrategyPettern.DuckExemple.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
