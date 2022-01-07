package designpatterns.observer;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Cellphone cellphone = new Cellphone(messenger);
        Computer computer = new Computer(messenger);
        Tablet tablet = new Tablet(messenger);

        messenger.attach(cellphone);
        messenger.attach(computer);
        messenger.attach(tablet);
        messenger.updateMessage("Starting up...");
        messenger.notifyObservers();
        messenger.detach(tablet);
        messenger.updateMessage("Hi Daniel! How are you?");
        messenger.notifyObservers();
    }
}
