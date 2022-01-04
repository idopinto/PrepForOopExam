package MyIterator;

import java.util.NoSuchElementException;

public class MyAggregate<E> implements Aggregate<E> {  // E = Type parameter
    // Hiding the representation.
    private Object[] elementData; // represented as object array
    private int idx;
    private int size;

    //
    public MyAggregate(int size) {
        if (size < 0)
            throw new IllegalArgumentException("size: " + size);
        this.size = size;
        elementData =  new Object[size];
    }

    public boolean add(E element) {
        if (idx < size) {
            elementData[idx++] = element;
            return true;
        } else
            return false;
    }

    public int getSize() {
        return size;
    }

    // Factory method for instantiating MyIterator.Iterator.
    public Iterator<E> createIterator() {
        return new MyIterator.MyAggregate.MyIterator<E>();
    }

    // Implementing MyIterator.Iterator as inner class.
    public class MyIterator<E> implements Iterator<E> {
        // Holds the current position in the traversal.
        private int cursor = 0; // index of next element to return

        public boolean hasNext() {
            return cursor < size;     // iterator has privileged access to MyIterator.Aggregate's fields
        }

        // protected getter for future expansion of iterator
        protected E getElement(int index){
            return (E) elementData[index];
        }

        public E next() {  // E = Type of element returned by this method
            if (cursor >= size)
                throw new NoSuchElementException();

            // PRIVILEGED ACCESS - MyAggregate doesn't expose a method for getting an element at an index!!

            return (E) elementData[cursor++]; // cast from Object to E
        }
    }
}
