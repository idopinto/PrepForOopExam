package designpatterns.observer;

/**
 * @author Ohad Klein
 */
public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}
