package designpatterns.strategy;

/**
 * @author Ohad Klein
 */
public class DanceStrategy implements BattleStrategy{
    @Override
    public void behavior() {
        System.out.println("DANCE!");
    }
}
