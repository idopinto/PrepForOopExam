package lambda_vs_reference;

import java.util.function.BiFunction;

public class LambdaVsMethodReference {
    public static void main(String[] args) {
        applyAndPrint(LambdaVsMethodReference::raiseToIntegerPowerAndAdd, 5.5, 2);
        applyAndPrint((num, power) -> num + Math.pow(num, power), 5.5, 2);

    }

    public static double raiseToIntegerPowerAndAdd(double num, int power) {
        return num + Math.pow(num, power);
    }

    public static void applyAndPrint(BiFunction<Double, Integer, Double> function, double a, int b) {
        System.out.println(function.apply(a, b));
    }
}