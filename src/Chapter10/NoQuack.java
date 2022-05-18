package Chapter10;

public class NoQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("i dont quack");
    }
}
