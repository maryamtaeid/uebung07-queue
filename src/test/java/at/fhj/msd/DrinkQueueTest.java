package at.fhj.msd;
 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;
 
public class DrinkQueueTest {
 
    private DrinkQueue queue;
 
    @BeforeEach
    public void setUp() {
        queue = new DrinkQueue();
    }
 
    @Test
    public void testOfferAddsElement() {
        assertTrue(queue.offer("Cola"));
        assertEquals("Cola", queue.peek());
    }
 
    @Test
    public void testPollRemovesAndReturnsElement() {
        queue.offer("Fanta");
        assertEquals("Fanta", queue.poll());
        assertNull(queue.poll()); // چون خالی شده
    }
 
    @Test
    public void testRemoveThrowsIfEmpty() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }
 
    @Test
    public void testRemoveReturnsFirstElement() {
        queue.offer("Pepsi");
        assertEquals("Pepsi", queue.remove());
    }
 
    @Test
    public void testPeekReturnsFirstWithoutRemoving() {
        queue.offer("Sprite");
        assertEquals("Sprite", queue.peek());
        assertEquals("Sprite", queue.peek()); // دوباره همونه چون حذف نشده
    }
 
    @Test
    public void testElementThrowsIfEmpty() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });
    }
 
    @Test
    public void testElementReturnsFirstElement() {
        queue.offer("Water");
        assertEquals("Water", queue.element());
    }
}