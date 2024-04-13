package behavioural.observer;

public class Client {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//        statisticsDisplay.deregister();
        weatherData.setMeasurements(80.4f, 89.7f, 90.8f);
    }

}
