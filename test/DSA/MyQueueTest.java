package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    private MyQueue myQueue;

    @BeforeEach
    public void startWith() {
        myQueue = new MyQueue(10);
    }

    @Test
    public void queueCanBeCreatedTest() {
        assertNotNull(myQueue);
    }

    @Test
    public void isQueueEmptyTest() {
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void isQueueFullTest() {
        assertFalse(myQueue.isFull());
    }

    @Test
    public void isQueueFullWhenActuallyFullTest() throws MyQueue.QueueIsFullException {
        myQueue.add("2");
        myQueue.add("tola");
        myQueue.add("fikayo");
        myQueue.add("bisola");
        myQueue.add("charles");
        myQueue.add("tjay");
        myQueue.add("toyo");
        myQueue.add("timi");
        myQueue.add("anu");
        myQueue.add("jide");
        assertTrue(myQueue.isFull());
    }

    @Test
    public void itemCanBeAddedToQueueTest() throws MyQueue.QueueIsFullException {
        myQueue.add("2");
        myQueue.add("tola");
        myQueue.add("fikayo");
        myQueue.add("bisola");
        assertEquals(4, myQueue.size());
    }

    @Test
    public void itemInFrontOfQueueCanBePeppedTest() throws MyQueue.QueueIsFullException {
        myQueue.add("100");
        myQueue.add("1");
        myQueue.add("3");
        myQueue.add("4");
        assertEquals("100", myQueue.peek());

    }

    @Test
    public void firstItemInQueueCanBeRemovedTest() throws MyQueue.QueueIsFullException {
        myQueue.add("100");
        myQueue.add("1");
        myQueue.add("3");
        myQueue.add("4");
        myQueue.remove();
        assertEquals(3, myQueue.size());
        assertEquals("1", myQueue.peek());
    }

    @Test
    public void moreItemsCanBeRemovedByFifoBasisTest() throws MyQueue.QueueIsFullException {
        myQueue.add("100");
        myQueue.add("1");
        myQueue.add("3");
        myQueue.add("4");
        myQueue.remove();
        myQueue.remove();
        assertEquals(2, myQueue.size());
        assertEquals("3", myQueue.peek());
    }

    @Test
    public void pollItemOnQueueTest() throws MyQueue.QueueIsFullException {
        myQueue.add("100");
        myQueue.add("1");
        assertEquals("100", myQueue.poll());
    }
}
