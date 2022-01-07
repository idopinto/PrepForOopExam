package designpatterns.singleton;

import java.util.function.*;

/**
 * @author Ohad Klein
 */
public class LambdaMaker {
    private final Supplier<Integer> incOneSupplier;
    private final Function<String, Integer> getStringLength;
    private final Function<Integer, String> intToStrFunc;
    private final BinaryOperator<Integer> getMax;
    private final BiPredicate<Integer, Integer> isModZero;
    private final UnaryOperator<String> getFirstThreeLetters;

    public LambdaMaker() {
        intToStrFunc = (a) -> a.toString();
        isModZero = (a, b) -> a % b == 0;
        getMax = Math::max;
        getStringLength = String::length;
        getFirstThreeLetters = (s) -> s.substring(0, Math.min(3, s.length()));
        incOneSupplier = new Supplier<Integer>() {
            int i = 1;

            @Override
            public Integer get() {
                return i++;
            }
        };
        Singleton.getInstance().logToSingleton("Made a LambdaMaker.");
    }

    public String getFirstThreeLetters(String str) {
        Singleton.getInstance().logToSingleton(
                String.format("Applied LambdaMaker.getFirstThreeLetters func on %s.", str));
        return this.getFirstThreeLetters.apply(str);
    }

    public int getStringLength(String str) {
        Singleton.getInstance().logToSingleton(
                String.format("Applied LambdaMaker.getStringLength func on %s.", str));
        return this.getStringLength.apply(str);
    }
}
