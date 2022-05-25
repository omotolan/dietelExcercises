package Chapter7Test;

import Chapter7.LinkedList.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {
    @Test
    public void addTest(){
        ArrayList list = new ArrayList();
        list.add("Clothes");
        assertEquals(1, list.size());
    }

    @Test
    public void removeTest(){
        ArrayList list = new ArrayList();
        list.add("Clothes");
        list.add("Clothes");
        list.remove(0);
        assertEquals(1, list.size());
    }

    @Test
    public void addAndGetTest(){
        ArrayList list = new ArrayList();
        list.add("Clothes");
        list.add("Shoes");
        assertEquals("Clothes", list.get(0));
        assertEquals("Shoes", list.get(1));
    }

    @Test
    public void addToAParticularIndex(){
        ArrayList list = new ArrayList();
        list.add(4, "Watch");
        assertEquals("Watch", list.get(4));
    }

    @Test
    public void removeParticularItem(){
        ArrayList list = new ArrayList();
        list.add("Clothes");
        list.add("Shoes");
        list.add("Watches");
        assertEquals(3, list.size());
        list.remove("Watches");
        assertEquals(2, list.size());
    }
}
