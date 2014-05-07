/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues.Applications.PriorityQueue;
/**
 *
 * @author assiterk
 * @param <T>
 */
public class PriorityQueue<T extends Comparable<? super T>> implements PriorityQueueInterface<T> {
    T[] pq;
    int capacity;
    
    public PriorityQueue() {
       this(100); 
    }
    public PriorityQueue(int inCap) {// two constructors
       capacity=inCap;
       pq =  (T[]) new Object[capacity];
  }

    public void add(T newEntry) {
        // add in priorit order
    }
 
    public T remove() { 
        return null;   
    }
    
    public T peek() {
        return null;
    }
    public boolean isEmpty() { return true;}
    public void clear() { }
    public int getSize() { return 0;}
    //public Iterator<T> iterator() { }
    
}
