package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;
    @BeforeEach
    public void startWith(){ stack = new Stack();}
    @Test
    public void stackCanBeCreatedTest(){
        assertNotNull(stack);
    }
    @Test
    public void stackIsEmptyTest(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushOneElement_stackIsNotEmptyTest(){
        stack.push(13);
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushX_popX_stackShouldBeEmptyTest(){
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushXandY_popY_stackShouldNotBeEmptyTest(){
        stack.push(14);
        stack.push(3);
        stack.pop();
        assertFalse(stack.isEmpty());

    }
}
