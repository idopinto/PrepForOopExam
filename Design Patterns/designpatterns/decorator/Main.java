package designpatterns.decorator;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        PizzaComponent pizza1 = new TomatoPizza(new ConcretePizzaComponent());
        PizzaComponent pizza2 = new MushroomPizza(new TomatoPizza(new ConcretePizzaComponent()));
        pizza1.printPizza();
        pizza2.printPizza();
    }
}
