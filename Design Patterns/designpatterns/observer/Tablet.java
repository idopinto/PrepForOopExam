package designpatterns.observer;

/**
 * @author Ohad Klein
 */
public class Tablet implements Observer{
    private final Messenger messenger;

    public Tablet(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void update() {
        System.out.println("New message on Tablet: " + messenger.getMessage());
    }
}
