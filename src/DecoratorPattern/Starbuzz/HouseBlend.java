package DecoratorPattern.Starbuzz;

public class HouseBlend extends Beverage {


    public HouseBlend() {
        description = "House blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
