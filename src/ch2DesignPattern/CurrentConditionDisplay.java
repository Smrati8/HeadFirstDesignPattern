package ch2DesignPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registeredObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current Conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }
}
