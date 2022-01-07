package designpatterns.decorator;

/**
 * @author Ohad Klein
 */
public class ConcretePizzaComponent implements PizzaComponent {
    @Override
    public void printPizza() {
        System.out.println("pizza");
    }
}
