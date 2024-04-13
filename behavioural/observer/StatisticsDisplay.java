package behavioural.observer;

public class StatisticsDisplay implements Observer {
    WeatherData weatherData;

    StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void notifyChange(float temp, float humidity, float pressure) {
        System.out.println("Statistics displaying... Temp: " + temp);
    }

    public void deregister() {
        this.weatherData.removeObserver(this);
    }
}
