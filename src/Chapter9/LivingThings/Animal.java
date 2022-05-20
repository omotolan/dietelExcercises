package Chapter9.LivingThings;

public class Animal extends LivingThing {
    public Animal(int number) {
        this();
        System.out.println("Im creating an animal");
    }

    public Animal() {
        System.out.println("i'm the one confusing you");
    }

    // if you override, it must match the parameter of the parent or super class
    @Override
    public void move() {
        // super.move(); // for parent class. if you want the child to exhibit parent method after 'overriding' the super class's method
        System.out.println("move like animal");

    }

    public void yourFathersMove() {
        super.move();
    }
}
