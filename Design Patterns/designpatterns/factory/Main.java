package designpatterns.factory;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        PlayerFactory factory = new PlayerFactory();
        factory.makePlayer("human").printPlayer();
        factory.makePlayer("ai").printPlayer();
        factory.makePlayer("random").printPlayer();
        for (int i = 0; i < 5; i++) {
            factory.makePlayer().printPlayer();
        }
    }
}
