package Queues.Implementations.LinkedBasedQueue;

public class LinkedQueue<E> {
  
  Node<E> head, tail;
  int size;
  
  public LinkedQueue() {
    size=0;
    head = null;
  }
  
  // *************************
  // ENQUEUE
  // *************************
  
  public void enqueue(E elem) {
    
    // *************************
    // Create node
    // *************************
  
    Node<E> node = new Node<E>();
    node.setElement(elem);
    node.setNext(null); // node will be new tail node
    
    if (size == 0)
      head = node; // special case of a previously empty queue
    else
      tail.setNext(node); // add node at the tail of the list
    
    tail = node; // update the reference to the tail node
    size++;
  }
  
  
  // *************************
  // DEQUEUE
  // *************************
  
  public E dequeue()  {
    
    // *************************
    // Store element at front
    // *************************
    E tmp = head.getElement();
  
    // *************************
    // Remove node
    // *************************
    head = head.getNext();
    size--;
    if (size == 0)
      tail = null; // the queue is now empty
    return tmp;
  }
  
  
  // ***************************************
  // MAIN
  //     TEST MY QUEUE !!!!!
  // ***************************************
  
  public static void main(String args[]) {
    LinkedQueue<Integer> iQueue = new LinkedQueue<Integer>();
    iQueue.enqueue(1);
    System.out.println(iQueue.dequeue());
  }
  
  
}
  
  
 

  
  