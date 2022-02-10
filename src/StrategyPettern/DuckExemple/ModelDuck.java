package StrategyPettern.DuckExemple;

import StrategyPettern.DuckExemple.Fly.FlyNoWay;
import StrategyPettern.DuckExemple.Quack.Quack;

public class ModelDuck extends  Duck {

    public ModelDuck() {
        flyingBehevior = new FlyNoWay();
        quackBehevior = new Quack();
    }


    @Override
    public void display() {
        System.out.println("Im a Model Duck");
    }
}
