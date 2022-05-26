package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    private MyQueue myQueue;

    @BeforeEach
    public void startWith() {
        myQueue = new MyQueue();
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
    public void itemCanBeAddedToQueueTest() {
        myQueue.add("2");
        myQueue.add("tola");
        myQueue.add("fikayo");
        myQueue.add("bisola");
        assertEquals(4, myQueue.size());
        assertEquals("2", myQueue.peek());
    }

    @Test
    public void itemInQueueCanBePeppedTest() {
        myQueue.add("100");
        myQueue.add("1");
        myQueue.add("3");
        myQueue.add("4");
        assertEquals("100", myQueue.peek());

    }

    @Test
    public void firstItemInQueueCanBeRemovedTest() {
        myQueue.add("100");
        myQueue.add("1");
        myQueue.add("3");
        myQueue.add("4");
        assertEquals("1", myQueue.remove());
    }

    @Test
    public void pollItemOnQueueTest() {
        myQueue.add("100");
        myQueue.add("1");
        assertEquals("100", myQueue.poll());
    }
}
