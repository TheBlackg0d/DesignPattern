package DecoratorPattern.Starbuzz;

public abstract class Beverage {
    public String description = "Unknown Beverage";



    public String getDescription() {
        return description;
    }

    protected abstract double  cost();

}
