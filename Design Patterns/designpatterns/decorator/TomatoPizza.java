package designpatterns.decorator;

/**
 * @author Ohad Klein
 */
public class TomatoPizza extends PizzaDecorator{
    public TomatoPizza(PizzaComponent pizzaComponent) {
        super(pizzaComponent);
    }

    @Override
    public void printPizza() {
        System.out.print("Tomato ");
        super.printPizza();
    }
}
