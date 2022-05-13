package Abstract;

public abstract class Vehicle {
    /*when you want a class to be inherited, and you want the subclass to always override the superclass's method, make the method
    * an abstract method. once the method is an abstract method, the superclass has to become an abstract class as well. An abstract
    * class must have at least one abstract method and such methods do not contain body(reason why when it is inherited, the subclass
    * object must override the abstract methods in order to be created that is, give the overridden abstract super class's methods
    * body(what you want the method to do or how to perform)) Abstract classes can contain other normal methods, can contain
    * constructors but not abstract constructors. Abstract class objects can not be created but can be referenced**/
    public void move(){
        System.out.println("move");
    }
    public abstract void turnRight();
}
