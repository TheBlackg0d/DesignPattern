package ObserverPattern.WeatherORama;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float avg;
    private float min;
    private float max;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/max/min temperature = " + avg + "/" + max + "/" + min);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (this.temperature == 0) {
            this.temperature = temperature;
            this.avg = temperature;
            this.max = temperature;
            this.min = temperature;
        } else if (temperature > this.temperature) {
            this.min = this.temperature;
            this.max = temperature;
        } else {
            this.max = this.temperature;
            this.min = temperature;
        }
        this.avg = (min + max)/2;
        this.temperature = temperature;
        display();
    }
}
