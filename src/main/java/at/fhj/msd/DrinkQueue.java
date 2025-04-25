package at.fhj.msd;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Class that manages a queue of Drink objects.
 */
public class DrinkQueue {

    // internal queue to hold drinks
    private Queue<Drink> queue;

    /**
     * Constructor initializes the internal queue.
     */
    public DrinkQueue() {
        queue = new LinkedList<>();
    }

    /**
     * Adds a drink to the queue.
     * 
     * @param drink the drink to add
     */
    public void addDrink(Drink drink) {
        queue.add(drink);
    }

    /**
     * Returns the first drink in the queue without removing it.
     *
     * @return the first drink or null if empty
     */
    public Drink peekDrink() {
        return queue.peek();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Returns the number of drinks in the queue.
     *
     * @return size of queue
     */
    public int size() {
        return queue.size();
    }

    /**
     * Prints the name of each drink in the queue.
     */
    public void printQueue() {
        for (Drink d : queue) {
            System.out.println(d.getName());
        }
    }
}
