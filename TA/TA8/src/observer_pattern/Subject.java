package observer_pattern;

public interface Subject {
    void attach(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
