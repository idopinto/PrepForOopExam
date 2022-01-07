package designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ohad Klein
 */
public class PartyAggregate<E> implements Aggregate<E>{
    private List<E> partyMembers = new ArrayList<>();

    @Override
    public Iterator<E> createIterator() {
        return new PartyIterator<E>();
    }

    @Override
    public boolean add(E e) {
        if (partyMembers.contains(e)) {
            return false;
        }
        return partyMembers.add(e);
    }

    @Override
    public boolean addGroup(Iterable<E> es) {
        for (E e: es) {
            if (!add(e)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean remove(E e) {
        return partyMembers.remove(e);
    }

    private class PartyIterator<E> implements Iterator{
        int curIdx = 0;

        @Override
        public Object next() {
            return partyMembers.get(curIdx++);
        }

        @Override
        public boolean hasNext() {
            return curIdx < partyMembers.size();
        }
    }
}
