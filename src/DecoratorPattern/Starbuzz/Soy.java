package DecoratorPattern.Starbuzz;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() { return beverage.getDescription() + ", Soy";}

    @Override
    public double cost() {
        return this.beverage.cost() + .15;
    }
}

