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
    public void penUp(){
        biro.penUp();
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if (direction == SOUTH){direction = WEST;}
        if(direction == EAST){direction = SOUTH;}
        if (direction == WEST){direction = NORTH;}
    }
    public void turnLeft(){

        if (direction == NORTH){face(WEST);}
        if (direction == WEST){face(SOUTH);}
        if (direction == EAST){ face(NORTH);}

    }
    public void face(Direction newDirection){
        direction = newDirection;
    }
}
