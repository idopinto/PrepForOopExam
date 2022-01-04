package observer_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextMessage implements Subject{

    private List<Observer> observerList= new ArrayList<>();
    private String data = new String();

    public TextMessage(){};

    public void scanSystemIn() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            data = data + line;
            notifyObservers();
        }
    }

    public String getData(){
        return data;
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update();
        }
    }
}
