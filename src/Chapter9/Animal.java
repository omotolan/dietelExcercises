package Chapter9;

public class Animal extends LivingThing {
    public Animal(int number){
        this();
        System.out.println("Im creating an animal");
    }

    public Animal(){
        System.out.println("i'm the one confusing you");
    }

// if you override, it must match the parameter of the parent or super class
    @Override
    public void move() {
       // super.move(); // for parent class. if you want the child to exhibit parent method
        System.out.println("move like animal");

    }

    public void yourFathesMove() {
        super.move();
    }
}
