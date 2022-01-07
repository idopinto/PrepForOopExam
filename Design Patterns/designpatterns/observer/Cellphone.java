package designpatterns.observer;

/**
 * @author Ohad Klein
 */
public class Cellphone implements Observer{
    private final Messenger messenger;

    public Cellphone(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void update() {
        System.out.println("New message on Cellphone: " + messenger.getMessage());
    }
}
