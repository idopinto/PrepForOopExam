package designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ohad Klein
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento m) {
        mementoList.add(m);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
