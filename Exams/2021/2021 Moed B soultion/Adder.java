public class Adder extends BiFunction {
    public Adder(BiFunction biFunction) {
        super(biFunction);
    }

    @Override
    public Function<Integer> apply(Function<Integer> f1, Function<Integer> f2) {
        Function<Integer> function = this.biFunction.apply(f1, f2);
        return a -> f1.apply(function.apply(a)) + f2.apply(function.apply(a));
    }
}
