package printqueue;
/**
 * Description: Class Queue definition Derived from List
 * @author Nomingerel Tserenjav and Muhammed Guroglu
 */
public class Queue extends List {
    // default constructor
    public Queue() {
        super("Queue");
    }
 /**
     * Returns one queue into the back
     * @param o Object
     */
    public synchronized void enqueue(Object o) {
        insertAtBack(o);
    }
/**
     * Takes one queue away from the front
     * @return removeFromFront
     * @throws EmptyListException exception
     */
    public synchronized Object dequeue() throws EmptyListException {
        return removeFromFront();
    }
 /**
     * Method: isEmpty()
     * Uses a simple isEmpty method and calls the isEmpty through a super 
     * reference
     * @return super.isEmpty()
     */
    public synchronized boolean isEmpty() {
        return super.isEmpty();
    }
/**
     * Method: print
     * Gets the print from the super class and applies it to the List class
     * @return super.print()
     */
    public synchronized String print() {
        return super.print();
    }

}
