package DecoratorPattern.Starbuzz;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() { return beverage.getDescription() + ", Soy";}

    @Override
    public double cost() {
        return this.beverage.cost() + .10;
    }
}
