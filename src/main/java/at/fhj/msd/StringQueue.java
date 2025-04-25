package at.fhj.msd;

/**
 * A simple String queue that extends the IQueue functionality.
 * This class sets a custom maxSize via constructor.
 */
public class StringQueue extends IQueue {

    /**
     * Constructs a StringQueue with a specified maximum size.
     *
     * @param maxSize the maximum number of elements the queue can hold
     */
    public StringQueue(int maxSize) {
        super(maxSize); // صدا زدن constructor پدر (IQueue)
    }
}
