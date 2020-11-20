package ch2DesignPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observersList;
    private float temp;
    private float humidity;
    private float pressure;

    WeatherData() {
        observersList = new ArrayList<Observer>();
    }

    public void registeredObserver(Observer o) {
        observersList.add(o);
    }

    public void removeObserver(Observer o) {
        int index = observersList.indexOf(o);
        if(index >= 0) {
            observersList.remove(index);
        }
    }

    public void notifyObserver() {
        for(Observer obs : observersList) {
            obs.update(this.temp, this.humidity, this.pressure);
        }
    }


    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
