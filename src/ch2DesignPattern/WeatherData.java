package ch2DesignPattern;

public class WeatherData {

    public float getTemperature(){
        return 0;
    }

    public float getHumidity() {
        return 0;
    }

    public float getPressure() {
        return 0;
    }

    public void measurementChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
}
