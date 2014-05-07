package Queues.Implementations.DoubleEndedQueue;

// *******************************************************
//  Double Ended Queue Implemented with Doubly Linked List
// *******************************************************

public class Deque<E> implements DequeInterface<E> {

  protected DLNode<E> header, trailer;        // sentinels
  protected int size;                         // number of elements
  
  public Deque() {                        // initialize an empty deque
    header = new DLNode<E>();
    trailer = new DLNode<E>();
    header.setNext(trailer);                  // make header point to trailer
    trailer.setPrev(header);                  // make trailer point to header
    size = 0;
  }
  
  public void addFirst(E o) {  
    DLNode<E> second = header.getNext();
    DLNode<E> first = new DLNode<E>(o, header, second);
    second.setPrev(first);
    header.setNext(first);
    size++;
  }
  
  public E getFirst()  {  
     return header.getNext().getElement();
  }

  public boolean isEmpty() {    
    if (size == 0)
      return true;
    return false;
  }
  
   public E removeLast()  {
  
    DLNode<E> last = trailer.getPrev();
    E o = last.getElement();
    DLNode<E> secondtolast = last.getPrev();
    trailer.setPrev(secondtolast);
    secondtolast.setNext(trailer);
    size--; 
    return o;
  }
   
  public int size() {   
      return size;
  }
    
  public static void main(String args[]) {
      Deque<String> myDQ = new Deque<String>();
      myDQ.addFirst(new String("Hi"));
      myDQ.addFirst(new String("Ho"));
      myDQ.addFirst(new String("Hi"));
      myDQ.addFirst(new String("Ho"));
      System.out.println(myDQ);
      if (!myDQ.isEmpty())
          myDQ.removeLast();
       System.out.println(myDQ);
      
      
  }
  
  public String toString() {
      String s = "";
      DLNode current;
      if (!isEmpty()) {
          for (current = header.getNext();current != trailer;current=current.getNext())
              s += current.getElement();
      }
      return s;
      
  }

    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addLast(E element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
      




