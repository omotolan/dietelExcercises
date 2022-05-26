package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyHashMapTest {
    private MyHashMap myHashMap;
    @BeforeEach
    public void startWith(){
        myHashMap = new MyHashMap();
    }
    @Test
    public void hashMapCanBeCreatedTest(){
        assertNotNull(myHashMap);
    }
    @Test
    public void hashMapIsEmptyTest(){
        assertTrue(myHashMap.isEmpty());
    }
    @Test
    public void keyAndValueCanBeAddedToHashMapTest() throws DuplicatedKeyValue {
        myHashMap.put(1,"tolani");
        myHashMap.put(5, "love");
        myHashMap.put(7, "love");
        myHashMap.put(7, "love");
        assertEquals(4, myHashMap.size());
    }

}
