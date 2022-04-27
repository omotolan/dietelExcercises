package Chapter9;

public class Vertebrate extends Animal {
    @Override
    public void move() {
        super.move();
        System.out.println("vertrbrate can move");
    }
}
