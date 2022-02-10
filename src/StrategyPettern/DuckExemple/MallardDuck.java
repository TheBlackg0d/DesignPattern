package StrategyPettern.DuckExemple;

import StrategyPettern.DuckExemple.Fly.FlyWithWings;
import StrategyPettern.DuckExemple.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyingBehevior = new FlyWithWings();
        this.quackBehevior = new Quack();
    }

    @Override
    public void display() {
       System.out.println("Hello Im a MallardDuck");
    }
}
