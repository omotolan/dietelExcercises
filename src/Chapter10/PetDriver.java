package Chapter10;

public class PetDriver {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.speak();
        Dog dog = new Dog();
        dog.speak();
        Cat cat = new Cat();
        cat.speak();
        Pet myDog = new Dog();
        myDog.speak();
      Cat myCat = (Cat)pet;
      myCat.speak();

    }
}
