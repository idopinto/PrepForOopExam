package new_functional_interface;

import java.util.Objects;

@FunctionalInterface
public interface TriConsumer<T, U, V> {

    void accept(T t, U u, V v);

    default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> after) {
        Objects.requireNonNull(after);
        return (T t, U u, V v) -> {
            accept(t, u, v);
            after.accept(t, u, v);
        };
    }
}
