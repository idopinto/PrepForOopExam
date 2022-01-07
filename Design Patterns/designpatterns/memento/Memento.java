package designpatterns.memento;

/**
 * @author Ohad Klein
 */
public class Memento {
    private final String state; // doesn't have to be a string

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
