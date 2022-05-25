package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private MyArrayList myArrayList;
    @BeforeEach
    public void startWith(){
         myArrayList = new MyArrayList();
    }
    @Test
    public void arrayListCanBeCreatedTest(){
        assertNotNull(myArrayList);
    }
    @Test
    public void arrayListIsEmptyTest(){
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void itemCanBeAddedToArrayListTest(){
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        assertEquals(2, myArrayList.size());
    }
    @Test
    public void itemCanBeAddedToArrayListWithIndexTest(){
        myArrayList.add(2, "tolani");
        assertEquals(1, myArrayList.size());

    }
    @Test
    public void findItemInArrayListTest(){
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        assertEquals("bunmi", myArrayList.get(2));
    }
    @Test
    public void ifArrayListContainsItemTest(){
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        assertTrue(myArrayList.contains("tobi"));

    }
    @Test
    public void indexOfItemCanBeGottenTest(){
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        assertEquals(2, myArrayList.indexOf("bunmi"));
    }
    @Test
    public void removeItemFromArrayListByIndexTest(){
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        myArrayList.remove(1);
        assertEquals(3, myArrayList.size());

       // assertEquals(false, myArrayList.contains("tobi"));
    }
    @Test
    public void itemCanBeSetInTheArrayListTest(){
        myArrayList.add("tolani");
        myArrayList.add("tobi");
        myArrayList.add("bunmi");
        myArrayList.add("femi");
        myArrayList.set(1, "ojo");
        assertTrue(myArrayList.contains("ojo"));

    }
    @Test
    public void arrayListCAanBeClearedTest(){
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

}
