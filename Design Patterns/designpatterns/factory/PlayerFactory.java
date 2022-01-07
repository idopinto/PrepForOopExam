package designpatterns.factory;

import java.util.Random;

/**
 * @author Ohad Klein
 */
public class PlayerFactory {
    public Player makePlayer(String input) {
        switch(input) {
            case "human":
                return new HumanPlayer();
            case "ai":
                return new AIPlayer();
            case "random":
                return new RandomPlayer();
            default:
                return null;
        }
    }

    public Player makePlayer() {
        switch(new Random().nextInt(3)) {
            case 0:
                return new HumanPlayer();
            case 1:
                return new AIPlayer();
            case 2:
                return new RandomPlayer();
            default:
                return null;
        }
    }
}
