package Chapter9.LivingThings;

public class Vertebrate extends Animal {

    public Vertebrate() {
        super(23);
        System.out.println("i'm creating a vertebrate");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("vertrbrate can move");
    }
}
