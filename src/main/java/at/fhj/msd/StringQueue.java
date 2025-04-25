package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * StringQueue implementation of IQueue interface using ArrayList.
 * Supports basic queue operations with a fixed max size.
 */
public class StringQueue implements IQueue {

    private List<String> elements = new ArrayList<>();
    private int maxSize;

    /**
     * Constructor that sets the maximum size of the queue.
     *
     * @param maxsize maximum number of elements allowed
     */
    public StringQueue(int maxsize) {
        this.maxSize = maxsize;
    }

    /**
     * Adds an element to the queue if it's not full.
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() >= maxSize)
            return false;

        elements.add(obj);
        return true;
    }

    /**
     * Returns and removes the first element in the queue, or null if empty.
     */
    @Override
    public String poll() {
        if (elements.isEmpty())
            return null;

        return elements.remove(0);
    }

    /**
     * Removes and returns the first element, or throws if empty.
     */
    @Override
    public String remove() {
        String element = poll();
        if (element == null)
            throw new NoSuchElementException("Queue is empty");

        return element;
    }

    /**
     * Returns the first element without removing it, or null if empty.
     */
    @Override
    public String peek() {
        if (elements.isEmpty())
            return null;

        return elements.get(0);
    }

    /**
     * Returns the first element, or throws if empty.
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null)
            throw new NoSuchElementException("Queue is empty");

        return element;
    }
}
