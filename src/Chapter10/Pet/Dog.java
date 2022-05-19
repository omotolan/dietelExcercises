package Chapter10.Pet;

public class Dog extends Pet {
    @Override
    public void speak(){
        System.out.println("i am a dog");
    }
    public void run(){
        System.out.println("i can run");
    }
}
