public enum  Functions implements Function<Function<Integer>> {
    POWER(f -> (a -> f.apply(a) * f.apply(a))), 
    NEGATIVE(f -> (a -> -1 * f.apply(a))),
    FIBONACCI(f -> (a -> f.apply(a - 1) + f.apply(a-2)));

    Function<Function<Integer>> function;
    Functions(Function<Function<Integer>> function) {
        this.function = function;
    }

    @Override
    public Function<Integer> apply(Function<Integer> param) {
        return this.function.apply(param);
    }
}
