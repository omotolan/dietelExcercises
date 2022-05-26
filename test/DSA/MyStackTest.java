package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    private MyStack myStack;

    @BeforeEach
    public void startWith() {
        myStack = new MyStack();
    }

    @Test
    public void stackCanBeCreatedTest() {
        assertNotNull(myStack);
    }

    @Test
    public void isStackEmptyTest() {
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void elementCanBePushedIntoStackTest() {
        myStack.push("rice");
        myStack.push("beans");
        myStack.push("garri");
        myStack.push("salt");
        assertEquals(4, myStack.size());

    }

    @Test
    public void elementCanBePoppedInStactTest() {
        myStack.push("rice");
        myStack.push("beans");
        myStack.push("garri");
        myStack.push("salt");
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        assertEquals(3, myStack.size());
    }

    @Test
    public void latestElementInStackCanBePeekedTest() {
        myStack.push("rice");
        myStack.push("beans");
        myStack.push("garri");
        myStack.push("salt");
        assertEquals("salt", myStack.peek());

    }

    @Test
    public void stackCanBePoppedAndPeekForTheLastItemInTest() {
        myStack.push("rice");
        myStack.push("beans");
        myStack.push("garri");
        myStack.push("salt");
        myStack.pop();
        assertEquals("garri", myStack.peek());
    }

    @Test
    public void stackCanBePopped_PeekAndAddItemInTest() {
        myStack.push("rice");
        myStack.push("beans");
        myStack.push("garri");
        myStack.push("salt");
        myStack.pop();
        assertEquals("garri", myStack.peek());
        myStack.push("ewedu");
        myStack.push("meat");
        assertEquals(5, myStack.size());
        assertEquals("meat", myStack.peek());
    }
}
