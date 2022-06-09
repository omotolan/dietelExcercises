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
        myLinkedList.add(34);
        myLinkedList.add(23);
        myLinkedList.add(1);
        myLinkedList.add(67);
        assertEquals(4, myLinkedList.size());
    }
    @Test
    public void insertItemAtFirstTest(){
        myLinkedList.add(34);
        myLinkedList.add(23);
        myLinkedList.add(1);
        myLinkedList.add(67);
        myLinkedList.addAtStart(2);

    }
    @Test
    public void insertAtLastTest(){
        myLinkedList.add(34);
        myLinkedList.add(23);
        myLinkedList.add(1);
        myLinkedList.add(67);
        myLinkedList.addAtLast(2);
    }
}
