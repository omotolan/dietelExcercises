package Chapter10.Pet;

public class PetDriver {
    public static void main(String[] args) {
        Pet[] mypets = new Pet[2];

        Pet pet = new Pet();
        pet.speak();
        Dog dog = new Dog();
        dog.speak();
        Cat cat = new Cat();
        cat.speak();
        Pet myDog = new Dog();
        myDog.speak();
        // down casting so i can access our dog's run method
      Dog ourDog = (Dog) myDog;
      ourDog.run();

        mypets[0] = dog;
        mypets[1] = cat;
        System.out.println();
        //to achieve down casting in the loop so i can access Dog's run method run while looping through the array
        for (Pet pets : mypets) {
            if (pets instanceof Dog){
                Dog doggy = (Dog) myDog;
                doggy.run();
            }
            pets.speak();

        }
        // to get class name
        System.out.println( cat.getClass());
    }
}
