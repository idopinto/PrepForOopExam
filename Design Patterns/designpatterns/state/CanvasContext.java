package designpatterns.state;

/**
 * @author Ohad Klein
 */
public class CanvasContext implements Context {
    private State drawing;
    @Override
    public void setState(State s) {
        this.drawing = s;
    }

    @Override
    public State getState() {
        return drawing;
    }
}
