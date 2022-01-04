package MyIterator;

public interface Aggregate<E> {
    Iterator<E> createIterator();
    boolean add(E element);
}

