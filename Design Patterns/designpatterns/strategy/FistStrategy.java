package designpatterns.strategy;

/**
 * @author Ohad Klein
 */
public class FistStrategy implements BattleStrategy{
    @Override
    public void behavior() {
        System.out.println("fist");
    }
}
