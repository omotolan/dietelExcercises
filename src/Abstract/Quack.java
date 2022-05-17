package Abstract;

public class Quack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I quack ");
    }
}
