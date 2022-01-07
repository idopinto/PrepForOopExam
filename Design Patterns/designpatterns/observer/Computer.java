package designpatterns.observer;

/**
 * @author Ohad Klein
 */
public class Computer implements Observer{
    private final Messenger messenger;

    public Computer(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void update() {
        System.out.println("New message on Computer: " + messenger.getMessage());
    }
}
