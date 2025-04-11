public Drink peekDrink() {
    return queue.peek();
}
 
public boolean isEmpty() {
    return queue.isEmpty();
}
 
public int size() {
    return queue.size();
}
 
public void printQueue() {
    for (Drink d : queue) {
        System.out.println(d.getName());
    }
}