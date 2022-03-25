/**
 * Created by Arabic on 23/02/22.
 */
public class CircularLinkedList<E> {
    Node<E>tail=null;
    int size=0;

    public CircularLinkedList() {
    }

    public int size(){return size;}
    public boolean isEmpty(){return size==0;}
    public E first(){
        if (isEmpty())return null;
        else return tail.getNext().getElement();
    }
    public E last(){
        if (isEmpty())return null;
        else return tail.getElement();
    }
   public void addFirst (E el){
       if (size==0)
       {
           tail=new Node<E>(el,null);
           tail.setNext(tail);
       }
       else {
           Node<E>newst=new Node<E>(el,tail.getNext());
           tail.setNext(newst);

       }
       size++;
   }
   public void addLast(E el){
       addFirst(el);
       tail=tail.getNext();
       size++;
   }
    public E removeFirst(){
        Node<E>remove=tail.getNext();
        if (isEmpty())return null;
        if(remove==tail)
        tail.setNext(null);
        tail=tail.getNext();
        if (size==0)
            tail=null;
        size--;
        return remove.getElement();
    }

    public void rotate(){
        if (isEmpty());
        tail=tail.getNext();
    }







    private static class Node<E>{
        E element ;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
