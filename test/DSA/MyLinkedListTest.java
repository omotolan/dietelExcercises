package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
