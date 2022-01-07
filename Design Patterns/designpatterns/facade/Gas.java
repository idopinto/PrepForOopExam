package designpatterns.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ohad Klein
 */
public class Gas {
    List<Pot> pots = new ArrayList<>();
    boolean isHeated = false;

    public void heat() {
        isHeated = true;
        for (Pot pot: pots) {
            pot.heat();
        }
    }

    public void put(Pot pot) {
        pots.add(pot);
        if (isHeated) {
            pot.heat();
        }
    }

    public void remove(Pot pot) {
        pots.remove(pot);
        pot.cool();
    }
}
