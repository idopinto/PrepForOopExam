package designpatterns.decorator;

/**
 * @author Ohad Klein
 */
public class MushroomPizza extends PizzaDecorator{
    public MushroomPizza(PizzaComponent pizzaComponent) {
        super(pizzaComponent);
    }
    public void printPizza() {
        System.out.print("Mushroom ");
        super.printPizza();
    }
}
