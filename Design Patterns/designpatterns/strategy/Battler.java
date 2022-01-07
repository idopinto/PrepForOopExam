package designpatterns.strategy;

/**
 * @author Ohad Klein
 */
public class Battler {
    private final BattleStrategy battleStrategy;
    public Battler(BattleStrategy battleStrategy) {
        this.battleStrategy = battleStrategy;
    }

    public void battle() {
        this.battleStrategy.behavior();
    }
}
