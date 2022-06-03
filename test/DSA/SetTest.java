package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set set;

    @BeforeEach
    public void startWith() {
        set = new Set();
    }

    @Test
    public void setCanBeCreatedTest() {
        assertNotNull(set);
    }

    @Test
    public void isSetEmptyTest() {
        assertTrue(set.isEmpty());
    }

    @Test
    public void addToSetTest() {
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        set.add("t");
        set.add("o");
        set.add("n");

        assertEquals(6, set.size());
    }

    @Test
    public void duplicateValuesCanNotBeAddedToSetTest() {
        set.add("tola");
        set.add("omo");
        set.add("omo");
        set.add("tola");
        assertEquals(2, set.size());

    }

    @Test
    public void setContainsItemTest() {
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        assertTrue(set.contains("tola"));
    }

    @Test
    public void setCanExpandTest() {
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        set.add("t");
        set.add("o");
        set.add("n");
        set.add("to");
        set.add("om");
        set.add("nd");
        set.add("tol");
        set.add("omo0");
        set.add("nds");
        assertEquals(12, set.size());
    }

    @Test
    public void addToSetWithIndexTest() {
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        set.add("t");
        set.add("o");
        set.add("n");
        set.add("to");
        set.add("om");
        set.add("nd");
        set.add("tol");
        set.add("omo0");
        set.add("nds");
        set.add(2, "lola");
        assertEquals(13, set.size());
        assertTrue(set.contains("ndsd"));
        assertEquals(3, set.indexOf("ndsd"));
    }

    @Test
    public void getIndexOfItemInSetTest() {
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        set.add("t");
        assertEquals(3, set.indexOf("t"));
    }

    @Test
    public void setItemInSetTest() {
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        set.add("t");
        set.set(1, "iya");
        assertTrue(set.contains("iya"));
        assertFalse(set.contains("omo"));
    }
    @Test
    public void removeByIndexTest(){
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        set.add("t");
        set.add("o");
        set.add("n");
        set.add("to");
        set.add("om");
        set.add("nd");
        set.add("tol");
        set.add("omo0");
        set.add("nds");
        set.remove(4);
        assertFalse(set.contains("o"));
        assertEquals(4, set.indexOf("n"));
        assertEquals(11, set.size());
    }
    @Test
    public void removeFromSetUsingItem(){
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        set.add("t");
        set.add("o");
        set.add("n");
        set.add("to");
        set.add("om");
        set.add("nd");
        set.add("tol");
        set.add("omo0");
        set.add("nds");
        set.remove("to");
        assertFalse(set.contains("to"));
        assertEquals(6, set.indexOf("om"));
        assertEquals(11, set.size());
    }
    @Test
    public void getItemFromSetTest(){
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        set.add("t");
        set.add("o");
        set.add("n");
        set.add("to");
        assertEquals("t", set.get(3));
    }
    @Test
    public void clearItemInSetTest(){
        set.add("tola");
        set.add("omo");
        set.add("ndsd");
        set.add("t");
        set.add("o");
        set.add("n");
        set.add("to");
        set.clear();
        assertEquals(null  , set.get(3));
        assertEquals(-1, set.indexOf("o"));
        assertFalse(set.contains("to"));
    }

}
