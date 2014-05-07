package Queues.Applications.Josephus;

import java.util.*;

// *******************************************************
// Array Implementation of a Queue
// *******************************************************

public class  ArrayQueue<E> implements Queue<E> { 
  
  protected E theQueue[];                      // The actual queue
  int front, rear;                             // Front and back of queue
  protected int capacity;                      // The actual capacity 
  
  
  /******************************************************** 
  * Constructors
  ********************************************************/
  public ArrayQueue() {
    this(100);                    // Call other constructor
  }
  
  public ArrayQueue(int inCap) {
    front=rear=0;
    capacity=inCap;
    theQueue =  (E[]) new Object[capacity];
  }
   
 /******************************************************** 
  * Returns the number of elements in the queue.
  * @return number of elements in the queue.
  ********************************************************/
  public int size() { 
    int s= (capacity-front+rear) % capacity;
    return s;
  }
  
 /******************************************************** 
  * Returns whether the queue is empty.
  * @return true if the queue is empty, false otherwise.
  *********************************************************/
  public boolean isEmpty() { 
    if (front == rear) 
      return true;
    return false;
  }
  
  public boolean isFull() { 
    if (size() == capacity-1)
      return true;
    else
      return false;
  }
  
 /******************************************************** 
  * Inspects the element at the front of the queue.
  * @return element at the front of the queue.
  * @exception EmptyQueueException if the queue is empty.
  ********************************************************/
  public E front() {
    return theQueue[front];
  }
    
  /******************************************************** 
  * Inserts an element at the rear of the queue.
  * @param element new element to be inserted.
  ********************************************************/
  public void enqueue (E element) {
    theQueue[rear]=element;
    rear= (rear+1) % capacity;                // Increment
  }
  
  /******************************************************** 
   * Removes the element at the front of the queue.
   * @return element removed.
   * @exception EmptyQueueException if the queue is empty.
   ********************************************************/
  public E dequeue(){
    E element = theQueue[front];
    front=(front+1)%capacity;
    return element;
  }
  
  /******************************************************** 
   * Print the Contents of the Queue
   ********************************************************/
  public String toString() {
    String pnt =  "[";
    int i = front;                // Start at the front
    
    while(i != rear) {            // until end of queue...
         pnt += " ";
         pnt += theQueue[i];
         i = (i+1) % capacity;   // next element...              
    }
    
    pnt +=  " ]";
    return pnt;  
  }
    
   
  /******************************************************** 
   * TEST THIS CLASS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   ********************************************************/
  
  public static void main(String args[]) {
    
    ArrayQueue<Integer> iQueue = new ArrayQueue<Integer>(5);
    System.out.println(iQueue.size());

    iQueue.enqueue(5);
    System.out.println(iQueue);
    System.out.println("Remove: " + iQueue.dequeue());
    System.out.println(iQueue);
    
    iQueue.enqueue(8);
    iQueue.enqueue(9);
    iQueue.enqueue(2);
    System.out.println(iQueue);
    
    while(!iQueue.isEmpty()) {
      System.out.println("Remove: " + iQueue.dequeue());
      System.out.println(iQueue);
    }
    
    // **********************
    // Array of strings
    // **********************
    ArrayQueue<String> sQueue = new ArrayQueue<String>(5);
    System.out.println(sQueue.size());

    sQueue.enqueue(new String("first"));
    System.out.println(sQueue);
    System.out.println("Remove: " + sQueue.dequeue());
    System.out.println(sQueue);
    
    sQueue.enqueue(new String("Hi"));
    sQueue.enqueue(new String("there"));
    sQueue.enqueue(new String("my"));
    System.out.println(sQueue);
    
    while(!sQueue.isEmpty()) {
      System.out.println("Remove: " + sQueue.dequeue());
      System.out.println(sQueue);
    }
  }
}

  
