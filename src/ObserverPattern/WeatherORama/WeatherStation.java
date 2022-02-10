package ObserverPattern.WeatherORama;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCoditionsDisplay currentCoditionsDisplay = new CurrentCoditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForeCastDisplay forecast = new ForeCastDisplay(weatherData);

        weatherData.setMessurements(80, 65, 30.4f);
        weatherData.setMessurements(82, 70, 29.2f);
        weatherData.setMessurements(78, 90, 29.2f);

    }
}
