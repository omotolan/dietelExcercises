package Chapter10.Duck;

import java.util.ArrayList;
import java.util.Scanner;

public class DuckDriver {
    static Scanner input = new Scanner(System.in);
    static CityDuck cityDuck = new CityDuck(2, 2);
    static WildDuck wildDuck = new WildDuck(4, 2);
    static RubberDuck rubberDuck = new RubberDuck(0, 0);
    static QuackQuack quackQuack = new QuackQuack();
    static Quack quack = new Quack();
    static NoQuack noQuack = new NoQuack();
    static FlyFly flyFly = new FlyFly();
    static NonFly nonFly = new NonFly();
    static boolean quit;

    public static void main(String[] args) {
        start();
        // interface has a is-a relationship with classes that implements it
        IFlyBehaviour fly = new NonFly();
        fly.fly();
    }

    private static void start() {
        instructions();
        varieties();
    }

    private static void instructions() {
        String options = """
                Types of Duck:
                press 1 to select a CityDuck
                press 2 to select a WildDuck
                press 3 to select a rubberDuck
                press 4 to quit
                """;
        System.out.println(options);
    }

    private static void cityDuck() {
        cityDuck.setIQuackBehaviour(quack);
        cityDuck.quack();
        cityDuck.setIFlyBehaviour(flyFly);
        cityDuck.fly();
    }

    private static void wildDuck() {
        wildDuck.setIQuackBehaviour(quackQuack);
        wildDuck.quack();
        wildDuck.setIFlyBehaviour(flyFly);
        wildDuck.fly();
    }

    private static void rubberDuck() {
        rubberDuck.setIQuackBehaviour(noQuack);
        rubberDuck.quack();
        rubberDuck.setIFlyBehaviour(nonFly);
        rubberDuck.fly();
    }

    private static void varieties() {
        while (!quit) {
        System.out.println("Enter Selection: ");
        int option = input.nextInt();

            switch (option) {
                case 1 -> cityDuck();
                case 2 -> wildDuck();
                case 3 -> rubberDuck();
                case 4 -> quit = true;
                default -> {
                    System.out.println("wrong selection.");
                }
            }
        }
    }

    private static void junks() {
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


        ArrayList<Duck> ducks = new ArrayList<>();

        ducks.add(cityDuck);
        ducks.add(wildDuck);
        ducks.add(rubberDuck);
        //quack behaviour
        cityDuck.setIQuackBehaviour(quack);
        wildDuck.setIQuackBehaviour(quackQuack);
        rubberDuck.setIQuackBehaviour(noQuack);
        for (Duck value : ducks) {
            value.quack();
        }

        // fly behaviour
        cityDuck.setIFlyBehaviour(flyFly);
        wildDuck.setIFlyBehaviour(flyFly);
        rubberDuck.setIFlyBehaviour(nonFly);
        for (int i = 0; i < ducks.size(); i++) {
            ducks.get(i).fly();
        }

        //fly and quack behaviour
        for (Duck value : ducks) {
            value.quack();
            value.fly();
        }
    }
}
