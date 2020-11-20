package ch2DesignPattern;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float max = 0.0f;
    private float min = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registeredObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;
        this.min = Math.min(min, temp);
        this.max = Math.max(max, temp);
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + max + "/" + min);
    }
}
