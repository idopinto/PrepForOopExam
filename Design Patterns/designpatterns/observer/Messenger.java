package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ohad Klein
 */
public class Messenger implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private String message = "";

    public void updateMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update();
        }
    }
}
