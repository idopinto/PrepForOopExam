package observer_pattern;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        TextMessage textMessage = new TextMessage();

        TextMessageObserver observer1 = new TextMessageObserver(textMessage, "Observer 1");
        TextMessageObserver observer2 = new TextMessageObserver(textMessage, "Observer 2");

        textMessage.attach(observer1);
        textMessage.attach(observer2);

        textMessage.scanSystemIn();

    }
}