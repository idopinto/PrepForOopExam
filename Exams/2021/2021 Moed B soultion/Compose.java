public class Compose extends BiFunction {

    public Compose(BiFunction biFunction) {
        super(biFunction);
    }

    @Override
    public Function<Integer> apply(Function<Integer> f1, Function<Integer> f2) {
        Function<Integer> composition = a -> f1.apply(f2.apply(a));
        Function<Integer> function = this.biFunction.apply(f1, f2);
        return a -> composition.apply(function.apply(a));
    }
    
    
}
