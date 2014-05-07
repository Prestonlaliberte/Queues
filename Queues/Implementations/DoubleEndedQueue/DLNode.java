package Queues.Implementations.DoubleEndedQueue;


/** Node of a doubly linked list of strings */
public class DLNode<T> {
  protected T element; // String element stored by a node
  protected DLNode<T> next, prev; // Pointers to next and previous nodes
  
  /** Constructor that creates a node with given fields */
  public DLNode(T e, DLNode p, DLNode n) {
    element = e;
    prev = p;
    next = n;
  }
  public DLNode() {
      this(null,null,null);
  }
  
  /** Returns the element of this node */
  public T getElement() { return element; }
  /** Returns the previous node of this node */
  public DLNode<T> getPrev() { return prev; }
  /** Returns the next node of this node */
  public DLNode<T> getNext() { return next; }
  /** Sets the element of this node */
  public void setElement(T newElem) { element = newElem; }
  
  /** Sets the previous node of this node */
  public void setPrev(DLNode<T> newPrev) { prev = newPrev; }
  /** Sets the next node of this node */
  public void setNext(DLNode<T> newNext) { next = newNext; }
  
 
  
  public static void main(String args[]) {
        DLNode<String> myNode = new DLNode("Hi with toString",null,null);
        System.out.println(myNode.getElement());
  }
  
}
