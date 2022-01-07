package designpatterns.facade;

/**
 * @author Ohad Klein
 */
public class Pasta implements Ingredient{
    private boolean isReady = false;

    @Override
    public void makeReady() {
        this.isReady = true;
    }

    @Override
    public void eat() {
        if (isReady) {
            System.out.println("Yummy!");
        } else {
            System.out.println("Eww!");
        }
    }
}
