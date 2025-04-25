package at.fhj.msd;

/**
 * This interface defines the basic operations of a queue.
 * It supports adding, removing, peeking, and checking elements in the queue.
 */
public interface IQueue {

    /**
     * Adds an object to the queue.
     * If the addition is successful, it returns true, otherwise false.
     *
     * @param obj the object to be added to the queue
     * @return true if the object was added successfully, false if the queue is full
     */
    public abstract boolean offer(String obj);

    /**
     * Removes and returns the first element in the queue.
     * If the queue is empty, returns null.
     *
     * @return the first element of the queue, or null if the queue is empty
     */
    public abstract String poll();

    /**
     * Removes and returns the first element in the queue.
     * If the queue is empty, throws a NoSuchElementException.
     *
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public abstract String remove();

    /**
     * Returns the first element in the queue without removing it.
     * If the queue is empty, returns null.
     *
     * @return the first element in the queue, or null if the queue is empty
     */
    public abstract String peek();

    /**
     * Returns the first element in the queue, equivalent to remove for peek operations.
     * If the queue is empty, throws a NoSuchElementException.
     *
     * @return the first element in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public abstract String element();
}
