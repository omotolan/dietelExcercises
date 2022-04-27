package Chapter9;

public class Animal extends LivingThing {

// if you override, it must match the parameter of the parent or super class
    @Override
    public void move() {
        super.move(); // for parent class. if you want the child to exhibit parent method
        System.out.println("move like animal");

    }

    public void yourFathesMove() {
    }
}
