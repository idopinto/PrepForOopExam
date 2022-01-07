package designpatterns.strategy;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        Battler swordBattler = new Battler(new SwordStrategy());
        Battler fistBattler = new Battler(new FistStrategy());
        Battler danceBattler = new Battler(new DanceStrategy());
        swordBattler.battle();
        fistBattler.battle();
        danceBattler.battle();
    }
}
