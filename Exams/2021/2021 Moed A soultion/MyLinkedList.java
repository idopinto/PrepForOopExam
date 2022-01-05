public class MyLinkedList<T extends Comparable<T>> implements Comparable<MyLinkedList<T>> {
    Node<T> first;

    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T item){
            this.item = item;
        }
    }

    public T getFirst(){
        return first.item;
    }

    public void addFirst(T item){
        Node<T> next = new Node<>(item);
        next.next = first;
        first = next;
        
    }

    public void addAll(MyLinkedList<? extends T> toAdd){
        Node<? extends T> node = toAdd.first;
        while(node != null){
            addFirst(node.item);
            node = node.next;
        }
    }

    @Override
    public int compareTo(MyLinkedList<T> o) {
        return getFirst().compareTo(o.getFirst());
    }
}


