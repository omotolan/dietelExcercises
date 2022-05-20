package Chapter10.Duck;

public interface Walk extends IFlyBehaviour{
    //interfaces can extend interfaces
    @Override
    void fly();
}
