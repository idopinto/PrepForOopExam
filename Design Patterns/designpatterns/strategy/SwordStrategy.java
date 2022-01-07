package designpatterns.strategy;

/**
 * @author Ohad Klein
 */
public class SwordStrategy implements BattleStrategy{
    @Override
    public void behavior() {
        System.out.println("sword");
    }
}
