package designpatterns.factory;

/**
 * @author Ohad Klein
 */
public class HumanPlayer implements Player {
    @Override
    public void printPlayer() {
        System.out.println("Human Player");
    }
}
