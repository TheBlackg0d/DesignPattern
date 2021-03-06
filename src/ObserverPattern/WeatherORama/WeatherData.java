package ObserverPattern.WeatherORama;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
         if ( i >= 0) {
             observers.remove(i);
         }
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(temperature, humidity, pressure);
        }
    }

    public void messurementsChanged() {
        notifyObservers();
    }

    public void setMessurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementsChanged();
    }


}
