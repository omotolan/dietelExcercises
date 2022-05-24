package Chapter7;


import static Chapter7.Direction.*;

public class Turtle {

    private Pen biro = new Pen();
    private Direction direction = Direction.EAST;

    public boolean isPenDown() {
        return biro.isDown();
    }

    public void penDown() {
        biro.penDown();
    }

    public void penUp() {
        biro.penUp();
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if (direction == SOUTH) {
            direction = WEST;
        } else if (direction == EAST) {
            direction = SOUTH;
        } else if (direction == WEST) {
            direction = NORTH;
        } else if (direction == NORTH) {
            direction = EAST;
        }
    }

    public void turnLeft() {

        if (direction == NORTH) {
            face(WEST);
        } else if (direction == WEST) {
            face(SOUTH);
        } else if (direction == EAST) {
            face(NORTH);
        } else if (direction == SOUTH) {
            face(EAST);
        }

    }

    public void face(Direction newDirection) {
        direction = newDirection;
    }
    public void move(){}
}
