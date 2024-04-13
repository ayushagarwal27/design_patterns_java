package behavioural.observer;

public class ForecastDisplay implements Observer {
    WeatherData weatherData;

    ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void notifyChange(float temp, float humidity, float pressure) {
        System.out.println("Forecast displaying... Temp: " + temp);
    }
}
