package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private MyArrayList myArrayList;

    @BeforeEach
    public void startWith() {
        myArrayList = new MyArrayList();
    }

    @Test
    public void arrayListCanBeCreatedTest() {
        assertNotNull(myArrayList);
    }

    @Test
    public void arrayListIsEmptyTest() {
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void itemCanBeAddedToArrayListTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void itemCanBeAddedToArrayListWithIndexTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        myArrayList.add("b");
        myArrayList.add("fe");
        myArrayList.add("u");
        myArrayList.add("e");
        myArrayList.add(6, "azeez");
        assertEquals(9, myArrayList.size());
        assertEquals(6, myArrayList.indexOf("azeez"));
        assertEquals(7, myArrayList.indexOf("u"));

    }

    @Test
    public void findItemInArrayListTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        assertEquals("bunmi", myArrayList.get(2));
    }

    @Test
    public void ifArrayListContainsItemTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        assertTrue(myArrayList.contains("tobi"));

    }

    @Test
    public void indexOfItemCanBeGottenTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        assertEquals(3, myArrayList.indexOf("femi"));
    }

    @Test
    public void removeItemFromArrayListByIndexTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        myArrayList.add("biodun");
        myArrayList.add("femi");
        myArrayList.add("biodun");
        assertEquals(3, myArrayList.indexOf("femi"));
        myArrayList.remove(2);
        assertEquals("femi", myArrayList.get(2));
        assertFalse(myArrayList.contains("bunmi"));
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));

        }
    }

    @Test
    public void removeItemFromArrayListByItemTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        myArrayList.add("biodun");
        myArrayList.remove("femi");
        assertEquals("biodun", myArrayList.get(3));
        assertFalse(myArrayList.contains("femi"));
    }

    @Test
    public void itemCanBeSetInTheArrayListTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        myArrayList.set(1, "ojo");
        assertTrue(myArrayList.contains("ojo"));
        assertFalse(myArrayList.contains("tobi"));

    }

    @Test
    public void arrayListCanBeClearedTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        myArrayList.clear();
        assertFalse(myArrayList.contains("tobi"));
        assertFalse(myArrayList.contains("tola"));
        assertFalse(myArrayList.contains("tunmi"));
        assertFalse(myArrayList.contains("femi"));

    }

    @Test
    public void arrayCanBeExpandedTest() {
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        myArrayList.add("tolu");
        myArrayList.add("d");
        myArrayList.add("a");
        myArrayList.add("t");
        myArrayList.add("d");
        myArrayList.add("e");
        myArrayList.add("f");
        myArrayList.add("g");
        myArrayList.add("h");
        myArrayList.add("i");
        myArrayList.add("j");
        myArrayList.add("k");
        myArrayList.add("l");
        myArrayList.add("m");
        assertEquals(18, myArrayList.size());
        assertEquals(0, myArrayList.indexOf("tolani"));
        assertEquals("d", myArrayList.get(8));
    }

}
