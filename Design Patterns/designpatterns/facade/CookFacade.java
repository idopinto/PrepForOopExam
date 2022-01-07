package designpatterns.facade;

/**
 * @author Ohad Klein
 */
public class CookFacade {
    public Pasta cookPasta() {
        Gas gas = new Gas();
        gas.heat();
        Pot pot = new Pot();
        pot.fillWithWater();
        gas.put(pot);
        Pasta pasta = new Pasta();
        pot.insert(pasta);
        pot.mix();
        gas.remove(pot);
        pot.extract(pasta);
        return pasta;
    }
}
