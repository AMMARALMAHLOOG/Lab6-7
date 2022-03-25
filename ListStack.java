/**
 * Created by Arabic on 23/02/22.
 */
public class ListStack<E>implements Stack<E> {
    SinglyLinkedList<E>list=new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(E el) {
    list.addFirst(el);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
}
