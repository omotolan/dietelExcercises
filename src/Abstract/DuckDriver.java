package Abstract;

public class DuckDriver {
    public static void main(String[] args) {
        Duck duck = new Duck(3, 2);

        CityDuck cityDuck = new CityDuck(2, 2);
        WildDuck wildDuck = new WildDuck(4, 2);
        RubberDuck rubberDuck = new RubberDuck(0, 0);
        // quack behaviours
        QuackQuack quackQuack = new QuackQuack();
        Quack quack = new Quack();
        NoQuack noQuack = new NoQuack();
        // fly behaviours
        FlyFly flyFly = new FlyFly();
        NonFly nonFly = new NonFly();


        cityDuck.setIQuackBehaviour(quack);
        cityDuck.quack();
        cityDuck.setIFlyBehaviour(flyFly);
        cityDuck.fly();

        wildDuck.setIQuackBehaviour(quackQuack);
        wildDuck.quack();
        wildDuck.setIFlyBehaviour(flyFly);
        wildDuck.fly();

        rubberDuck.setIQuackBehaviour(noQuack);
        rubberDuck.quack();
        rubberDuck.setIFlyBehaviour(nonFly);
        rubberDuck.fly();


    }
}
