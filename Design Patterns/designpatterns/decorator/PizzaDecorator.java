package designpatterns.decorator;

/**
 * @author Ohad Klein
 */
public abstract class PizzaDecorator implements PizzaComponent{
    private final PizzaComponent pizzaComponent;

    public PizzaDecorator(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
    }

    @Override
    public void printPizza() {
        pizzaComponent.printPizza();
    }
}
