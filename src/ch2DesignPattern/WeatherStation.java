package ch2DesignPattern;

public class WeatherStation {
    public static void main(String arg[]) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay sd = new StatisticsDisplay(weatherData);
        ForecastDisplay fd = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
