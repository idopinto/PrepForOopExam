package designpatterns.state;

/**
 * @author Ohad Klein
 */
public interface Context {
    void setState(State s);
    State getState();
}
