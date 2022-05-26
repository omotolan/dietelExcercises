package Chapter7Test;

import Chapter7.Turtle.Direction;
import Chapter7.Turtle.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;
    @BeforeEach
    public void startWith(){
        turtle = new Turtle();
    }
    @Test
    public void turtleCanBeCreated(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }
    @Test
    public void turtlePenIsUpByDefault(){
        boolean isPenDown = turtle.isPenDown();
        assertFalse(isPenDown);
    }
    @Test
    public void turtleCanMovePenDownTest(){
        assertFalse(turtle.isPenDown());
        turtle.penDown();
        assertTrue(turtle.isPenDown());
    }
    @Test
    public void turtleCanMovePenUpTest(){
        turtle.penUp();
        assertFalse(turtle.isPenDown());
    }
    @Test
    public void turtleFacesEastByDefaultTest(){
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightFromEastTest(){
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightFromSouthTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightFromWestTest(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftFromEastTest(){
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftFromNorthTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftFromWestTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());
    }
   // @Test

}
