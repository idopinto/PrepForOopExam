public class BiFunction {
    protected BiFunction biFunction;

    protected BiFunction(BiFunction biFunction) {
        this.biFunction = biFunction;
    }

    public BiFunction() {
        
    }

    public Function<Integer> apply(Function<Integer> f1, Function<Integer> f2){
        return a -> a;
    }

    public static void main(String[] args) {
        // to create composerAdder
        BiFunction biFunction = new Compose(new Adder(new BiFunction()));
    }
}
