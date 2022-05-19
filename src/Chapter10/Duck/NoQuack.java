package Chapter10.Duck;

public class NoQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("i dont quack");
    }
}
