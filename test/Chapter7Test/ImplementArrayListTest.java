package Chapter7Test;

import Classwork.ImplementArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ImplementArrayListTest {
    private ImplementArrayList implementArrayList;

    @BeforeEach
    public void startWith() {
        implementArrayList = new ImplementArrayList();
    }

    @Test
    public void arrayListCanBeCreated(){
        assertNotNull(implementArrayList);
    }
    @Test
    public void arrayListIsEmptyTest(){}
}
