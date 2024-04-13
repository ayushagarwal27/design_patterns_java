package behavioural.observer;

public interface Observer {
    void notifyChange(float temp, float humidity, float pressure);
}
