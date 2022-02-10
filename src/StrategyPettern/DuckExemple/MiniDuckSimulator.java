package StrategyPettern.DuckExemple;

import StrategyPettern.DuckExemple.Fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.display();
        d.performFly();
        d.performQuack();

        Duck duckModel = new ModelDuck();

        duckModel.setFlyingBehevior(new FlyRocketPowered());
        duckModel.performFly();
    }
}
