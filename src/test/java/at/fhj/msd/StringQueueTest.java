package at.fhj.msd;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringQueueTest {

    private StringQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new StringQueue(2);
    }

    @Test
    public void testOfferAddsElementWhenNotFull() {
        assertTrue(queue.offer("first"));
        assertTrue(queue.offer("second"));
    }

    @Test
    public void testOfferReturnsFalseWhenFull() {
        queue.offer("first");
        queue.offer("second");
        assertFalse(queue.offer("third"));
    }

    @Test
    public void testPollReturnsFirstElementAndRemovesIt() {
        queue.offer("first");
        queue.offer("second");
        assertEquals("first", queue.poll());
        assertEquals("second", queue.peek());
    }

    @Test
    public void testPollReturnsNullIfEmpty() {
        assertNull(queue.poll());
    }

    @Test
    public void testRemoveReturnsFirstElement() {
        queue.offer("first");
        assertEquals("first", queue.remove());
    }

    @Test
    public void testRemoveThrowsExceptionIfEmpty() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }

    @Test
    public void testPeekReturnsFirstElementWithoutRemoving() {
        queue.offer("first");
        assertEquals("first", queue.peek());
        assertEquals("first", queue.peek());
    }

    @Test
    public void testPeekReturnsNullIfEmpty() {
        assertNull(queue.peek());
    }

    @Test
    public void testElementReturnsFirstElement() {
        queue.offer("first");
        assertEquals("first", queue.element());
    }

    @Test
    public void testElementThrowsExceptionIfEmpty() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });
    }
}
