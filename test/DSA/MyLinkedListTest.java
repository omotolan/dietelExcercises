package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    private MyLinkedList myLinkedList;

    @BeforeEach
    public void startWith() {
        myLinkedList = new MyLinkedList();
    }
    @Test
    public void linkedListCanBeCreatedTest(){
        assertNotNull(myLinkedList);
    }
    @Test
    public void linkedListIsEmptyTest(){
        assertTrue(myLinkedList.isEmpty());
    }
    @Test
    public void itemCanBeAddedToLinkedList(){
        myLinkedList.insert(34);
        myLinkedList.insert(23);
        myLinkedList.insert(1);
        myLinkedList.insert(67);
        assertEquals(4, myLinkedList.size());
    }
}
