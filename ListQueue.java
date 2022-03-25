/**
 * Created by Arabic on 23/02/22.
 */
public class ListQueue<E>implements Queue<E> {
     SinglyLinkedList<E>ls=new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return ls.isEmpty();
    }

    @Override
    public int size() {
        return ls.size();
    }

    @Override
    public void enQueue(E el) {
        ls.addLast(el);

    }

    @Override
    public E deQueue() {
        return ls.removeFirst();
    }
}
