package designpatterns.singleton;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        //TODO fix in ipad - static and etc
        LambdaMaker lambdaMaker = new LambdaMaker();
        NameGenerator nameGenerator = new NameGenerator();
        Singleton.getInstance().logToSingleton(
                String.format("Result: %s", lambdaMaker.getFirstThreeLetters(nameGenerator.getName())));
        Singleton.getInstance().logToSingleton(
                String.format("Result: %s", lambdaMaker.getStringLength(nameGenerator.getName())));
        System.out.println(Singleton.getInstance().getLog());
    }


}