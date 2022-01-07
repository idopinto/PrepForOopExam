package designpatterns.iterator;

/**
 * @author Ohad Klein
 */
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
