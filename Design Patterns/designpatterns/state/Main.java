package designpatterns.state;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        CanvasContext canvas = new CanvasContext();
        System.out.println("Let's make our canvas draw a rabbit:");
        canvas.setState(new RabbitState());
        canvas.getState().handle();
        System.out.println("Now a dolphin:");
        canvas.setState(new DolphinState());
        canvas.getState().handle();
        System.out.println("Now a seahorse:");
        canvas.setState(new SeahorseState());
        canvas.getState().handle();
    }
}
