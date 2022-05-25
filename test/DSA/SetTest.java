package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set set;
    @BeforeEach
    public void startWith(){
        set = new Set();
    }
    @Test
    public void setCanBeCreatedTest(){
        assertNotNull(set);
    }
    @Test
    public void isSetEmptyTest(){
        assertTrue(set.isEmpty());
    }
    @Test
    public void duplicateValuesCanNotBeAddedToSetTest(){
        set.add("tola");
        set.add("omo");
        set.add("tol");
        assertEquals(1, set.size());

    }
}
