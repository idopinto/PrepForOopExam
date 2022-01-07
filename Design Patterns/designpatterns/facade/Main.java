package designpatterns.facade;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        Pasta pasta = new Pasta();
        System.out.print("First attempt: ");
        pasta.eat(); // uncooked!
        CookFacade cook = new CookFacade();
        Pasta cookedPasta = cook.cookPasta();
        System.out.print("Second attempt: ");
        cookedPasta.eat(); // should be good
    }
}
