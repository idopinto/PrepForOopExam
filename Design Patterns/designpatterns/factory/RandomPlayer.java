package designpatterns.factory;

/**
 * @author Ohad Klein
 */
public class RandomPlayer implements Player{
    @Override
    public void printPlayer() {
        System.out.println("Random Player");
    }
}
