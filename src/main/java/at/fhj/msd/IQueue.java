package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class that defines a simple queue structure.
 * Supports adding, removing, peeking, and checking elements.
 */
public class IQueue {

    private List<String> elements;
    private int maxSize;

    /**
     * Constructor to initialize the queue with a max size.
     *
     * @param maxSize maximum number of elements the queue can hold
     */
    public IQueue(int maxSize) {
        this.maxSize = maxSize;
        this.elements = new ArrayList<>();
    }

    /**
     * Adds an object to the queue if there is space.
     *
     * @param obj the object to be added to the queue
     * @return true if the object was added successfully, false if the queue is full
     */
    public boolean offer(String obj) {
        if (elements.size() >= maxSize) {
            return false;
        }
        elements.add(obj);
        return true;
    }

    /**
     * Removes and returns the first element in the queue.
     * If the queue is empty, returns null.
     *
     * @return the first element of the queue, or null if the queue is empty
     */
    public String poll() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.remove(0);
    }

    /**
     * Removes and returns the first element in the queue.
     * If the queue is empty, throws a NoSuchElementException.
     *
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return element;
    }

    /**
     * Returns the first element in the queue without removing it.
     * If the queue is empty, returns null.
     *
     * @return the first element in the queue, or null if the queue is empty
     */
    public String peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
    }

    /**
     * Returns the first element in the queue.
     * If the queue is empty, throws a NoSuchElementException.
     *
     * @return the first element in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return element;
    }
}
