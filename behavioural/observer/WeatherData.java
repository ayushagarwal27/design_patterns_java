package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

    List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData() {
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observerList) {
            ob.notifyChange(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObservers();
    }
}
