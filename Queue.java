/**
 * Created by Arabic on 23/02/22.
 */
public interface Queue<E> {
    int sz = 0;
    public boolean isEmpty();
    public int size();
    public void enQueue (E el);
    public E deQueue();
}
