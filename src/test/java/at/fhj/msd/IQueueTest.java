package at.fhj.msd;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IQueueTest {

    private IQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new IQueue(2); // صف با ظرفیت ۲ تا
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
        assertFalse(queue.offer("third")); // اضافه کردن سومین عنصر که باید false شود
    }

    @Test
    public void testPollReturnsFirstElementAndRemovesIt() {
        queue.offer("first");
        queue.offer("second");

        assertEquals("first", queue.poll());
        assertEquals("second", queue.poll());
    }

    @Test
    public void testPollReturnsNullWhenEmpty() {
        assertNull(queue.poll());
    }

    @Test
    public void testRemoveReturnsFirstElement() {
        queue.offer("first");
        assertEquals("first", queue.remove());
    }

    @Test
    public void testRemoveThrowsExceptionWhenEmpty() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }

    @Test
    public void testPeekReturnsFirstElementWithoutRemoving() {
        queue.offer("first");
        assertEquals("first", queue.peek());
        assertEquals("first", queue.peek()); // دوبار چک کردن بدون حذف
    }

    @Test
    public void testPeekReturnsNullWhenEmpty() {
        assertNull(queue.peek());
    }

    @Test
    public void testElementReturnsFirstElement() {
        queue.offer("first");
        assertEquals("first", queue.element());
    }

    @Test
    public void testElementThrowsExceptionWhenEmpty() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });
    }
}
