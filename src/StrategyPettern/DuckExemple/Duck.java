package StrategyPettern.DuckExemple;

public abstract class Duck {
    protected FlyBehavior flyingBehevior;
    protected QuackBehavior quackBehevior;
    public Duck() {}

    public void setFlyingBehevior(FlyBehavior flyingBehevior) {
        this.flyingBehevior = flyingBehevior;
    }

    public void setQuackBehevior(QuackBehavior quackBehevior) {
        this.quackBehevior = quackBehevior;
    }

    public void swim() {
        System.out.println("Im a duck and im swimming");
    }

    public abstract void display();

    public void performFly() {
        flyingBehevior.fly();
    }

    public void performQuack() {
        quackBehevior.quack();
    }

}
