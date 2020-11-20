package ch2DesignPattern;


public interface Subject {
    public void registeredObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
