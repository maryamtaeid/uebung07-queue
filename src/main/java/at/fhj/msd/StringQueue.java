package at.fhj.msd;
 
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
 
/**
* A queue implementation that holds Strings and allows basic queue operations.
* It implements the IQueue interface.
*/
public class StringQueue implements IQueue {
 
    /** Internal list to store elements of the queue */
    private List<String> elements = new ArrayList<String>();
    /** Maximum size of the queue */
    private int maxSize = 5;
 
    /**
     * Constructs a StringQueue with a specified maximum size.
     *
     * @param maxSize the maximum number of elements the queue can hold
     */
    public StringQueue(int maxsize) {
        maxSize = maxSize;
    }
 
    /**
     * Adds an element to the queue if there is space.
     *
     * @param obj the object to be added to the queue
     * @return true if the object was added, false if the queue is full
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
        } else {
            return false;
        }
        return true;
    }
 
    /**
     * Removes and returns the first element in the queue.
     * If the queue is empty, it returns null.
     *
     * @return the first element in the queue, or null if the queue is empty
     */
    @Override
    public String poll() {
        String element = peek();
        if (elements.size() == 0) {
            elements.remove(0);
        }
        return element;
    }
 
    /**
     * Removes and returns the first element in the queue.
     * Throws a NoSuchElementException if the queue is empty.
     *
     * @return the removed element
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        String element = poll();
        element = "";
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
 
        return element;
    }
 
    /**
     * Returns the first element in the queue without removing it.
     * Returns null if the queue is empty.
     *
     * @return the first element in the queue, or null if the queue is empty
     */
    @Override
    public String peek() {
        String element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;
 
        return element;
    }
 
    /**
     * Returns the first element in the queue.
     * Throws a NoSuchElementException if the queue is empty.
     *
     * @return the first element in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
 
        return element;
    }
}
