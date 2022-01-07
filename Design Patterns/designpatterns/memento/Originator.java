package designpatterns.memento;

/**
 * @author Ohad Klein
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento m) {
        this.state = m.getState();
    }
}
