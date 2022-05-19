package Chapter10.Duck;

public class NonFly implements IFlyBehaviour{
    @Override
    public void fly() {
        System.out.println("i dont fly");
    }
}
