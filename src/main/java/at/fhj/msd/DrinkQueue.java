package at.fhj.msd;

import java.util.LinkedList;
import java.util.Queue;

public class DrinkQueue {

    private Queue<Drink> queue;

    public DrinkQueue() {
        queue = new LinkedList<>();
    }

    public void addDrink(Drink drink) {
        queue.add(drink);
    }

    public Drink removeDrink() {
        return queue.poll();
    }

    public void clear() {
        queue.clear();
    }
}
