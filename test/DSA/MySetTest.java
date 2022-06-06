package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    private MySet mySet;

    @BeforeEach
    public void startWith() {
        mySet = new MySet();
    }

    @Test
    public void setCanBeCreatedTest() {
        assertNotNull(mySet);
    }

    @Test
    public void isSetEmptyTest() {
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addToSetTest() {
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        mySet.add("t");
        mySet.add("o");
        mySet.add("n");

        assertEquals(6, mySet.size());
    }

    @Test
    public void duplicateValuesCanNotBeAddedToSetTest() {
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("omo");
        mySet.add("tola");
        assertEquals(2, mySet.size());

    }

    @Test
    public void setContainsItemTest() {
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        assertTrue(mySet.contains("tola"));
    }

    @Test
    public void setCanExpandTest() {
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        mySet.add("t");
        mySet.add("o");
        mySet.add("n");
        mySet.add("to");
        mySet.add("om");
        mySet.add("nd");
        mySet.add("tol");
        mySet.add("omo0");
        mySet.add("nds");
        assertEquals(12, mySet.size());
    }

    @Test
    public void addToSetWithIndexTest() {
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        mySet.add("t");
        mySet.add("o");
        mySet.add("n");
        mySet.add("to");
        mySet.add("om");
        mySet.add("nd");
        mySet.add("tol");
        mySet.add("omo0");
        mySet.add("nds");
        mySet.add(2, "lola");
        assertEquals(13, mySet.size());
        assertTrue(mySet.contains("ndsd"));
        assertEquals(3, mySet.indexOf("ndsd"));
    }

    @Test
    public void getIndexOfItemInSetTest() {
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        mySet.add("t");
        assertEquals(3, mySet.indexOf("t"));
    }

    @Test
    public void setItemInSetTest() {
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        mySet.add("t");
        mySet.set(1, "iya");
        assertTrue(mySet.contains("iya"));
        assertFalse(mySet.contains("omo"));
    }
    @Test
    public void removeByIndexTest(){
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        mySet.add("t");
        mySet.add("o");
        mySet.add("n");
        mySet.add("to");
        mySet.add("om");
        mySet.add("nd");
        mySet.add("tol");
        mySet.add("omo0");
        mySet.add("nds");
        mySet.remove(4);
        assertFalse(mySet.contains("o"));
        assertEquals(4, mySet.indexOf("n"));
        assertEquals(11, mySet.size());
    }
    @Test
    public void removeFromSetUsingItem(){
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        mySet.add("t");
        mySet.add("o");
        mySet.add("n");
        mySet.add("to");
        mySet.add("om");
        mySet.add("nd");
        mySet.add("tol");
        mySet.add("omo0");
        mySet.add("nds");
        mySet.remove("to");
        assertFalse(mySet.contains("to"));
        assertEquals(6, mySet.indexOf("om"));
        assertEquals(11, mySet.size());
    }
    @Test
    public void getItemFromSetTest(){
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        mySet.add("t");
        mySet.add("o");
        mySet.add("n");
        mySet.add("to");
        assertEquals("t", mySet.get(3));
    }
    @Test
    public void clearItemInSetTest(){
        mySet.add("tola");
        mySet.add("omo");
        mySet.add("ndsd");
        mySet.add("t");
        mySet.add("o");
        mySet.add("n");
        mySet.add("to");
        mySet.clear();
        assertEquals(null  , mySet.get(3));
        assertEquals(-1, mySet.indexOf("o"));
        assertFalse(mySet.contains("to"));
    }

}
