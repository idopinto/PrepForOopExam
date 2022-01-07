package designpatterns.iterator;

/**
 * @author Ohad Klein
 */
public interface Aggregate<E> {
    Iterator<E> createIterator();
    boolean add(E e);
    boolean addGroup(Iterable<E> es);
    boolean remove(E e);
}
